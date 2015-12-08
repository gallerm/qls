package pl.mgaller.qls.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mariusz Galler <mariusz.galler@gmail.com>
 */

@Entity
@Table(name="question")
public class QuestionJpa extends BaseJpa {
    
    String text;
    
    @Column(name = "answer_0")
    String answer0;
    
    @Column(name = "answer_1")
    String answer1;
    
    @Column(name = "answer_2")
    String answer2;
    
    @Column(name = "answer_3")
    String answer3;
    
    byte[] image;
    
    public String getText() {
        return text;
    }

    public String getAnswer0() {
        return answer0;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public byte[] getImage() {
        return image;
    }
}
