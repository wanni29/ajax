package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // DB 조회 => pc 에 category 객체생성 -> 빈생성자를 호출 // 나중에 실험해보기
@Setter
@Getter
@Table(name = "category_tb")
@Entity // 얘가 있어야 hibernate가 관리한다.
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name; // 백엔드, 프론트엔드, DBA // 데이터베이스 최고 관리자

    @Builder
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
