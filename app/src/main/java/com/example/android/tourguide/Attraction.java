package com.example.android.tourguide;

/**
 * Created by sj on 11/20/2017.
 */

public class Attraction {

    private String mAttractionName;
    private String mAttractionDescription;
    private int mAttractionImageId;

    /**
     * Create a new Attraction object.
     *
     * @param attractionName is a name of the place
     * @param attractionDescription is the description of the place
     * @param attractionImageId is the image resource id of the place
     */
    public Attraction(int attractionImageId, String attractionName, String attractionDescription){
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
    }

    /**
     * Get the image resource Id of the place
     */
    public int getAttractionImageId() {
        return mAttractionImageId;
    }

    /**
     * Get the name of the place
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the description of the place
     */
    public String getAttractionDescription() {
        return mAttractionDescription;
    }

}

