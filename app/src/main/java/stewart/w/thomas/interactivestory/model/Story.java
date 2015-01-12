package stewart.w.thomas.interactivestory.model;

import stewart.w.thomas.interactivestory.R;

/**
 * Created by rogerhull on 1/4/15.
 */
public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                "%1$s is confused on where to begin the journey. One path leads to the kitchen, while another leads to the living room. One thing is for sure. There is gold afoot. %1$s tries to smell around for any treasure in the air, but to no avail. The gold's location is nowhere in sight.",
                new Choice("Go to the living room", 1),
                new Choice ("Go to the kitchen", 4)
        );

        mPages[1] = new Page(
                R.drawable.page1,
                "An intimidating piece of furniture blocks %1$s\'s view. The only sensible thing to do would be either search within the couch cushions or underneath the sofa. Both locations, %1$s recalls, have kept many a man's coin in the past.",
                new Choice("Search the cushions", 2),
                new Choice("Search under the sofa", 3));

        mPages[2] = new Page(
                R.drawable.page2,
                "%1$s finds a note hidden in the upholstery. It says to follow the magic trail to the kitchen. There is still some curiosity as to what lies beneath the couch, but this note might be the ticket straight to the treasure.",
                new Choice("Head to the kitchen", 4),
                new Choice("Search beneath the couch", 3));

        mPages[3] = new Page(
                R.drawable.page3,
                "The mission has proved fruitful! %1$s will be going home as one happy leprechaun. All mystical Irish folk will swell with jealousy as they behold the fortune %1$s will be taking home as his prize.");

        mPages[4] = new Page(
                R.drawable.page4,
                "This foreign land of dishware and cutlery intimidates young %1$s. There are only two practical places one would hide the gold in this area. It has to be either the pantry or the microwave. The choice is daunting.",
                new Choice("Climb to the microwave", 5),
                new Choice("Traverse to the pantry", 6));

        mPages[5] = new Page(
                R.drawable.page5,
                "It seems there is leftover pasta smeared against the inside of the microwave. It looks like a message. %1$s can barely make out the word \"SOFA\". It seems it was the wrong decision to journey to the kitchen. Though %1$s is still curious about the pantry.",
                new Choice("Check out the pantry", 6),
                new Choice("Trek over to the underside of the sofa", 3));

        mPages[6] = new Page(
                R.drawable.page6,
                "The door to the pantry closes as soon as %1$s enters. Little %1$s is extremely disappointed. There is no treasure here. It was a trap. And %1$s walked right into it.");


    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
