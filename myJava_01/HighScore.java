public static class HighScore {
    double score;
    String name;

    HighScore(double score, String name)
    {
        this.score = score;
        this.name = name;
    }
    public void setScore(double score)
    {
        this.score = score;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public double getScore()
    {
        return this.score;
    }

}
