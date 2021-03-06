/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.algo;

/**
 *
 * @author java4
 */
import twitter4j.*;
import twitter4j.auth.AccessToken;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class PublicPosts {

    public static void main(String[] args) {
    
    }
    public void setData(String ckey, String cskey, String atoken, String atsecret, String msg) throws IOException, TwitterException {
        //Your Twitter App's Consumer Key
        String consumerKey = ckey;
        //Your Twitter App's Consumer Secret
        String consumerSecret = cskey;
        //Your Twitter Access Token
        String accessToken = atoken;
        //Your Twitter Access Token Secret
        String accessTokenSecret = atsecret;
        //Instantiate a re-usable and thread-safe factory
        TwitterFactory twitterFactory = new TwitterFactory();
        //Instantiate a new Twitter instance
        Twitter twitter = twitterFactory.getInstance();
        //setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        //setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

        //Instantiate and initialize a new twitter status update
        StatusUpdate statusUpdate = new StatusUpdate(msg);
        //attach any media, if you want to
//        statusUpdate.setMedia("http://www.jpinfotech.org/", new URL("C:/Users/java4/Desktop/KAVI/1java.png").openStream());

        //tweet or update status
        Status status = twitter.updateStatus(statusUpdate);

        //response from twitter server
        System.out.println("status.toString() = " + status.toString());
        System.out.println("status.getInReplyToScreenName() = " + status.getInReplyToScreenName());
        System.out.println("status.getSource() = " + status.getSource());
        System.out.println("status.getText() = " + status.getText());

        System.out.println("status.getURLEntities() = " + Arrays.toString(status.getURLEntities()));
        System.out.println("status.getUserMentionEntities() = " + Arrays.toString(status.getUserMentionEntities()));
    }

}
