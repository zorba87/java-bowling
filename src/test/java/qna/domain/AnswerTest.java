package qna.domain;

import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import static org.assertj.core.api.Assertions.assertThat;

public class AnswerTest {
    public static final Answer A1 = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    public static final Answer A2 = new Answer(UserTest.SANJIGI, QuestionTest.Q1, "Answers Contents2");

    @Test
    void delete_성공() throws CannotDeleteException {
        Answer answer = ofUser(11L,UserTest.JAVAJIGI);
        answer.delete(UserTest.JAVAJIGI);

        assertThat(answer.isDeleted()).isTrue();
    }

    public static Answer ofUser(long id, User user){
        return new Answer(id,user, QuestionTest.Q1,"Test");
    }
}
