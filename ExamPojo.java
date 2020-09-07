/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author THE UNIVERSE BOSS
 */
public class ExamPojo {
    private String ExamId;

    @Override
    public String toString() {
        return "ExamPojo{" + "ExamId=" + ExamId + ", language=" + language + ", totalQuestions=" + totalQuestions + '}';
    }
    private String language;
    private int totalQuestions;

    public ExamPojo() {
    }

    public ExamPojo(String ExamId, String language, int totalQuestions) {
        this.ExamId = ExamId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }
    
    

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    
    
}
