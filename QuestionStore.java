
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author THE UNIVERSE BOSS
 */
public class QuestionStore {
    ArrayList<QuestionPojo>questionList;
    public QuestionStore()
    {
        questionList=new ArrayList<>();
        
    }
    public void addQue(QuestionPojo q)
    {
        questionList.add(q);
    }
    public QuestionPojo getQuestion(int pos){
        return questionList.get(pos);
    }
    public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,QuestionPojo q){
        questionList.add(pos,q);
    }
    public ArrayList<QuestionPojo>getAllQuestions(){
        return questionList;
    }
    public int getCount(){
        return questionList.size();
    }
}
