package DesignPatterns.Excercise.WebSearch;

public class FriendQueryFilterPolicy implements QueryFilterPolicy {
    @Override
    public boolean shouldNotify(String query) {
        return query.toLowerCase().contains("friend");
    }
}

// Concrete query filter policy implementation for filtering queries longer than 60 characters

