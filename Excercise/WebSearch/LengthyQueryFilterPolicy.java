package DesignPatterns.Excercise.WebSearch;

class LengthyQueryFilterPolicy implements QueryFilterPolicy {
    @Override
    public boolean shouldNotify(String query) {
        return query.length() > 60;
    }
}