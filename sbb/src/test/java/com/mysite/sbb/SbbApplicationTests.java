package com.mysite.sbb;

import jakarta.transaction.Transactional;
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

  @Autowired
  private AnswerRepository answerRepository;

  @Test
  @Transactional
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

//    -------------------------------------------------------
//    답변 데이터 생성 후 저장하기
//    Optional<Question> oq = this.questionRepository.findById(2);
//    assertTrue(oq.isPresent());
//    Question q = oq.get();
//
//    Answer a = new Answer();
//    a.setContent("네 자동으로 생성됩니다.");
//    a.setQuestion(q); //어떤 질문의 답변인지 알기 위해 Question 객체 필요
//    a.setCreateDate(LocalDateTime.now());
//    this.answerRepository.save(a);

//    -------------------------------------------------------
//    답변 조회(id가 1인 답변을 조회 후 그 답변의 질문 id가 2인것도 조회 = 답변에 연결된 질문 찾기)
//    Optional<Answer> oa = this.answerRepository.findById(1);
//    assertTrue(oa.isPresent());
//    Answer a = oa.get();
//    assertEquals(2,a.getQuestion().getId());

//    -------------------------------------------------------
//    답변 조회(질문에 연결된 답변 찾기)
//    Optional<Question> oq = this.questionRepository.findById(2);
//    assertTrue(oq.isPresent());
//    Question q = oq.get();
//
//    List<Answer> answerList = q.getAnswerList();
//
//    assertEquals(1, answerList.size());
//    assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
  }
}