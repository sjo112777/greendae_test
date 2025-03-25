package kr.co.greendae.entity.Lecture;


import jakarta.persistence.*;
import kr.co.greendae.entity.user.Professor;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Lecture")
public class Lecture {

    /*
    * 강의 목록 출력
    * 과목코드, 학과, 학년, 구분, 과목명, 교수, 학점, 수강시간, 강의실, 최대수강인원
    *
    * 강의 등록 시 추가 정보
    * 수업기간, 평가 양식, 교재
    * */

    @Id
    private String lecNo;   //과목 코드

    /*
    * ----------------------------------------------------
    * private String lecClass;    //학과
    * ----------------------------------------------------
    * 학과 : professor 객체
    *         - department 객체
    *               - deptName(학과 이름)
    * ----------------------------------------------------
    * */

    @ManyToOne
    @JoinColumn(name = "proNo")
    private Professor professor;  //담당교수

    private String lecName;  //과목명
    private String lecCate;  //과목 구분(전공선택)
    private int lecGrade;    //학년
    private int lecCredit;   //학점
    private int lecStdTotal; //총 수강인원(추가)
    private int lecStdCount; //현재 수강인원
    private String lecRoom;  //강의실
    private String lecTime;  //강의시간
    private String book;     //교재(출판사 - 도서명 - 저자 입력)
    private String lecSchedule; // 수강기간(mm/dd/yy)

    /*
    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Register> registers = new ArrayList<>();

    public LectureDTO toLectureDTO(){
        return LectureDTO.builder()
                .lecNo(lecNo)
                .lecName(lecName)
                .lecCate(lecCate)
                .lecGrade(lecGrade)
                .lecProName(lecProName)
                .lecCredit(lecCredit)
                .lecStdCount(lecStdCount)
                .lecClass(lecClass)
                .lecRoom(lecRoom)
                .lecTime(lecTime)
                .build();
    }
*/

    /*
    @Id
    private int lecNo;

    private String lecName;
    private String lecCate;
    private int lecGrade;
    private String lecProName;
    private int lecCredit;
    private int lecStdNo;
    private String lecClass;
    private String lecRoom;
    private String lecTime;

    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Register> registers;

    public LectureDTO toDTO(){
        return LectureDTO.builder()
                .lecNo(lecNo)
                .lecName(lecName)
                .lecCate(lecCate)
                .lecGrade(lecGrade)
                .lecProName(lecProName)
                .lecCredit(lecCredit)
                .lecStdNo(lecStdNo)
                .lecClass(lecClass)
                .lecRoom(lecRoom)
                .lecTime(lecTime)
                .build();
    }

     */


}
