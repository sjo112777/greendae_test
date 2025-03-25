package kr.co.greendae.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "User")
public class User {

    @Id
    private String uid;     // 아이디
    private String pass;    // 비밀번호 (기초값 : 주민)
    private String name;    // 이름
    private String email;   // 이메일
    private String hp;      // 전화번호
    private String role;    // 역할(관리자, 학생, 교사)
    private String zip;     // IP주소
    private String addr1;   // 주소
    private String addr2;   // 자세한 주소
    private String ssn;     // 주민번호
    private String ename;   // 영문명
    private String gender;  // 성
    private String nationality; // 국적
    private String regDate; // 가입일자
    private String leaveDate; //탈퇴일자

    @OneToOne(mappedBy = "user")
    private Student student;

}
