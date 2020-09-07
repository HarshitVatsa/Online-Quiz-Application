/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.Objects;

/**
 *
 * @author THE UNIVERSE BOSS
 */
public class AnswerPojo {
    private String examid;
    private String subject;
    private int qno;
    private String choosenAns;
    private String correctAns;

    public String getExamid() {
        return examid;
    }

    public AnswerPojo(String examid, String subject, int qno, String choosenAns, String correctAns) {
        this.examid = examid;
        this.subject = subject;
        this.qno = qno;
        this.choosenAns = choosenAns;
        this.correctAns = correctAns;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnswerPojo other = (AnswerPojo) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examid, other.examid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.choosenAns, other.choosenAns)) {
            return false;
        }
        if (!Objects.equals(this.correctAns, other.correctAns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnswerPojo{" + "examid=" + examid + ", subject=" + subject + ", qno=" + qno + ", choosenAns=" + choosenAns + ", correctAns=" + correctAns + '}';
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getChoosenAns() {
        return choosenAns;
    }

    public void setChoosenAns(String choosenAns) {
        this.choosenAns = choosenAns;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
    
}
