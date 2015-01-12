package stewart.w.thomas.interactivestory.model;

/**
 * Created by rogerhull on 1/4/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String choice, int nextPage){
        mText = choice;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
