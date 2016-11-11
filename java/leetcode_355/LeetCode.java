package leetcode_355;

import java.util.*;

/**
 * Created by pyan on 11/10/2016.
 */
public class LeetCode {
    public class Twitter {

        /** Initialize your data structure here. */
        Map<Integer, Set<Integer>> relation;
        Stack<int[]> tweet;
        public Twitter() {
            relation = new HashMap<>();
            tweet = new Stack<>();
        }

        /** Compose a new tweet. */
        public void postTweet(int userId, int tweetId) {
            int[] newTweet = new int[2];
            newTweet[0] = userId;
            newTweet[1] = tweetId;
            this.tweet.push(newTweet);
            Set<Integer> userRel = this.relation.getOrDefault(userId, new HashSet<>());
            userRel.add(userId);
            this.relation.put(userId, userRel);
        }

        /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
        public List<Integer> getNewsFeed(int userId) {
            List<Integer> res = new ArrayList<>();
            Set<Integer> userRel = this.relation.getOrDefault(userId, new HashSet<>());
            userRel.add(userId);
            Stack<int[]> temp = (Stack<int[]>)this.tweet.clone();
            while (!temp.isEmpty()) {
                int[] pop = temp.pop();
                if (userRel.contains(pop[0])) {
                    res.add(pop[1]);
                }
                if (res.size() == 10) {
                    break;
                }
            }
            return res;
        }

        /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
        public void follow(int followerId, int followeeId) {
            Set<Integer> userRel = this.relation.getOrDefault(followerId, new HashSet<>());
            userRel.add(followerId);
            userRel.add(followeeId);
            this.relation.put(followerId, userRel);
        }

        /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
        public void unfollow(int followerId, int followeeId) {
            Set<Integer> userRel = this.relation.getOrDefault(followerId, new HashSet<>());
            userRel.remove(followeeId);
            this.relation.put(followerId, userRel);
        }
    }
}
