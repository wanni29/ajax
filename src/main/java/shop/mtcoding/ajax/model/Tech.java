package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // DB 조회 => pc 에 category 객체생성 -> 빈생성자를 호출 // 나중에 실험해보기
@Setter
@Getter
@Table(name = "tech_tb")
@Entity // 얘가 있어야 hibernate가 관리한다.
public class Tech {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name; // Spring, Java, Javascript, React, HTML

    // @ManyToOne 이거를 적으면 lazy 전략이 아니라 eager 전략이야.
    // @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

}
