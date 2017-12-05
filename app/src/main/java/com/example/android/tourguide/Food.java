package com.example.android.tourguide;

/**
 * {@link Food} represents a Food image, name, description, address, transportation,
 *  phone number, web site, operation hours, price.
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
     * Create a new Food object.
     *
     * @param foodImageId is the image resource id of the place
     * @param foodName is a name of the place
     * @param foodDescription is the description of the place
     * @param foodAddress is the address of the place
     * @param foodTransportation is the transportation of the place
     * @param foodPhone is the phone number of the place
     * @param foodWeb is the website of the place
     * @param foodHours is the operating hours of the place
     * @param foodFee is the price of the food
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
     * Create a new Food object. (For better than beef)
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
     * Create a new Food object. (For chicken)
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
     * Create a new Food object. (for bamdokkaebi)
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
    int getFoodImageId() {
        return mFoodImageId;
    }

    /**
     * Get the name of the food
     */
    String getFoodName() {
        return mFoodName;
    }

    /**
     * Get the description of the food
     */
    String getFoodDescription() {
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
