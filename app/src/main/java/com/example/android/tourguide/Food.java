package com.example.android.tourguide;

/**
 * Created by sj on 12/3/2017.
 */

public class Food {

    private int mFoodImageId;
    private String mFoodName;
    private String mFoodDescription;
    private String mFoodAddress;
    private String mFoodTransportation;
    private String mFoodPhone;
    private String mFoodWeb;
    private String mFoodHours;
    private String mFoodFee;

    /**
     * (For food)
     * @param foodImageId
     * @param foodName
     * @param foodDescription
     * @param foodAddress
     * @param foodTransportation
     * @param foodPhone
     * @param foodWeb
     * @param foodHours
     * @param foodFee
     */
    public Food(int foodImageId, String foodName, String foodDescription,
                      String foodAddress, String foodTransportation, String foodPhone,
                      String foodWeb,String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodPhone = foodPhone;
        mFoodWeb = foodWeb;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }

    /**
     * (For food, better than beef)
     */
    public Food(int foodImageId, String foodName, String foodDescription,
                      String foodAddress, String foodTransportation, String foodPhone,
                      String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodPhone = foodPhone;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }

    /**
     * For food, chicken
     */
    public Food(int foodImageId, String foodName, String foodDescription, String foodPhone,
                String foodWeb,String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodPhone = foodPhone;
        mFoodWeb = foodWeb;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }

    /**
     * for bamdokkaebi
     * @param foodName
     * @param foodImageId
     * @param foodDescription
     * @param foodAddress
     * @param foodTransportation
     * @param foodWeb
     * @param foodHours
     * @param foodFee
     */
    public Food(String foodName, int foodImageId, String foodDescription,
                String foodAddress, String foodTransportation, String foodWeb,
                String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodWeb = foodWeb;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }

    /**
     * Get the image resource Id of the food
     */
    public int getFoodImageId() {
        return mFoodImageId;
    }

    /**
     * Get the name of the food
     */
    public String getFoodName() {
        return mFoodName;
    }

    /**
     * Get the description of the food
     */
    public String getFoodDescription() {
        return mFoodDescription;
    }

    /**
     * Get the address of the food
     */
    String getFoodAddress() {
        return mFoodAddress;
    }

    /**
     * Get the transportation of the food
     */
    String getFoodTransportation() {
        return mFoodTransportation;
    }

    /**
     * Get the phone number of the food
     */
    String getFoodPhone() {
        return mFoodPhone;
    }

    /**
     * Get the web page of the food
     */
    String getFoodWeb() {
        return mFoodWeb;
    }

    /**
     * Get the hours of the food
     */
    String getFoodHours() {
        return mFoodHours;
    }

    /**
     * Get the Admission Fee of the food
     */
    String getFoodFee() {
        return mFoodFee;
    }



}
