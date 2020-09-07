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
public class UserProfile {
    private static String username;
    private static String usertype;
    
    public static void setUserType(String usertype)
    {
        UserProfile.usertype=usertype;
    }
    
    public static String getUserType()
    {
        return usertype;
    }
    
    public static void setUserName(String username)
    {
        UserProfile.username=username;
    }
    
    public static String getUserName()
    {
        return username;
    }
}
