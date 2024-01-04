package com.mysite.sbb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

  @Autowired
  private QuestionRepository questionRepository;

  @Test
  void testJpa() {
//    질문 데이터 저장
//    Question q1 = new Question();
//    q1.setSubject("sbb가 뭐임?");
//    q1.setContent("sbb에 대해 알고싶음");
//    q1.setCreateDate(LocalDateTime.now());
//    this.questionRepository.save(q1); // 첫번째 질문 저장
//
//    Question q2 = new Question();
//    q2.setSubject("스프링부트 모델 질문");
//    q2.setContent("id는 자동으로 생성되나요?");
//    q2.setCreateDate(LocalDateTime.now());
//    this.questionRepository.save(q2); // 두번째 질문 저장
//-------------------------------------------------------
//    질문 데이터 조회
//    질문 갯수 조회와 제목과 같은지 테스트
//    List<Question> all = this.questionRepository.findAll();
//    assertEquals(2, all.size());
//
//    Question q = all.get(0);
//    assertEquals("sbb가 뭐임?", q.getSubject());

//    id값으로 데이터 조회
//    Optional<Question> oq = this.questionRepository.findById(1);
//    if (oq.isPresent()){
//      Question q = oq.get();
//      assertEquals("sbb가 뭐임?", q.getSubject());
//    }

//    제목으로 데이터 조회
//    Question q = this.questionRepository.findBySubject("sbb가 뭐임?");
//    assertEquals(1, q.getId());

//    제목과 내용으로 데이터 조회
//      Question q = this.questionRepository.findBySubjectAndContent("sbb가 뭐임?", "sbb에 대해 알고싶음");
//      assertEquals(1, q.getId());

//    제목에 특정 문자열이 포함되어 있는 데이터 조회
    /**
     * sbb%: "sbb"로 시작하는 문자열
     * %sbb: "sbb"로 끝나는 문자열
     * %sbb%: "sbb"를 포함하는 문자열
     */

//    List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//    Question q = qList.get(0);
//    assertEquals("sbb가 뭐임?", q.getSubject());

//    -------------------------------------------------------
//    질문 데이터 수정
//    Optional<Question> oq = this.questionRepository.findById(2);
//    assertTrue(oq.isPresent());
//    Question q = oq.get();
//    q.setSubject("수정된 제목");
//    this.questionRepository.save(q);

//    -------------------------------------------------------
//    질문 데이터 삭제
//    assertEquals(2, this.questionRepository.count());
//    Optional<Question> oq = this.questionRepository.findById(1);
//    assertTrue(oq.isPresent());
//    Question q = oq.get();
//    this.questionRepository.delete(q);
//    assertEquals(1, this.questionRepository.count());
  }
}