package com.example.android.tourguide;

/**
 * Created by sj on 11/20/2017.
 */

public class Attraction {

    private int mAttractionImageId;
    private String mAttractionName;
    private String mAttractionShortDs;
    private String mAttractionDescription;
    private String mAttractionAddress;
    private String mAttractionTransportation;
    private String mAttractionPhone;
    private String mAttractionWeb;
    private String mAttractionHours;
    private String mAttractionFee;

    /**
     * Create a new Attraction object. (for DMZ tour)
     *
     * @param attractionImageId is the image resource id of the place
     * @param attractionName is a name of the place
     * @param attractionShortDs is the short description of the place
     * @param attractionDescription is the description of the place
     * @param attractionWeb is the website of the place
     */
    public Attraction(int attractionImageId, String attractionName, String attractionShortDs,
                      String attractionDescription, String attractionWeb){
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionShortDs = attractionShortDs;
        mAttractionDescription = attractionDescription;
        mAttractionWeb = attractionWeb;
    }

    /**
     * Create a new Attraction object. (for Hongik University Street)
     *
     * @param attractionImageId is the image resource id of the place
     * @param attractionName is a name of the place
     * @param attractionShortDs is the short description of the place
     * @param attractionDescription is the description of the place
     * @param attractionAddress is the address of the place
     * @param attractionTransportation is the transportation of the place
     * @param attractionPhone is the phone number of the place
     */
    public Attraction(int attractionImageId, String attractionName, String attractionShortDs,
                      String attractionDescription, String attractionAddress,
                      String attractionTransportation, String attractionPhone){
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionShortDs = attractionShortDs;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionPhone = attractionPhone;
    }

    /**
     * Create a new Attraction object.
     *
     * @param attractionImageId is the image resource id of the place
     * @param attractionName is a name of the place
     * @param attractionShortDs is the short description of the place
     * @param attractionDescription is the description of the place
     * @param attractionAddress is the address of the place
     * @param attractionTransportation is the transportation of the place
     * @param attractionPhone is the phone number of the place
     * @param attractionWeb is the website of the place
     * @param attractionHours is the operating hours of the place
     * @param attractionFee is the admission fee of the place
     */
    public Attraction(int attractionImageId, String attractionName, String attractionShortDs,
                      String attractionDescription, String attractionAddress,
                      String attractionTransportation, String attractionPhone,
                      String attractionWeb, String attractionHours, String attractionFee) {
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionShortDs = attractionShortDs;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionPhone = attractionPhone;
        mAttractionWeb = attractionWeb;
        mAttractionHours = attractionHours;
        mAttractionFee =attractionFee;
    }

    public Attraction(int attractionImageId, String attractionName, String attractionDescription,
                      String attractionAddress, String attractionTransportation, String attractionHours) {
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionHours = attractionHours;
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
     * Get the short description of the place
     */
    public String getAttractionShortDs() {
        return mAttractionShortDs;
    }

    /**
     * Get the description of the place
     */
    public String getAttractionDescription() {
        return mAttractionDescription;
    }

    /**
     * Get the address of the place
     */
    String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Get the transportation of the place
     */
    String getAttractionTransportation() {
        return mAttractionTransportation;
    }

    /**
     * Get the phone number of the place
     */
    String getAttractionPhone() {
        return mAttractionPhone;
    }

    /**
     * Get the web page of the place
     */
    String getAttractionWeb() {
        return mAttractionWeb;
    }

    /**
     * Get the hours of the place
     */
    String getAttractionHours() {
        return mAttractionHours;
    }

    /**
     * Get the Admission Fee of the place
     */
    String getAttractionFee() {
        return mAttractionFee;
    }

}

