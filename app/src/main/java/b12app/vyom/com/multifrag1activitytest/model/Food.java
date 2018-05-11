package b12app.vyom.com.multifrag1activitytest.model;

import com.google.gson.Gson;

import java.util.List;

public class Food {


    private List<FoodBean> Food;

    public static Food objectFromData(String str) {

        return new Gson().fromJson(str, Food.class);
    }

    public List<FoodBean> getFood() {
        return Food;
    }

    public void setFood(List<FoodBean> Food) {
        this.Food = Food;
    }

    public static class FoodBean {
        public FoodBean(String foodId, String foodName, String foodRecepiee, String foodPrice, String foodCategory, String foodThumb) {
            FoodId = foodId;
            FoodName = foodName;
            FoodRecepiee = foodRecepiee;
            FoodPrice = foodPrice;
            FoodCategory = foodCategory;
            FoodThumb = foodThumb;
        }

        /**
         * FoodId : 701
         * FoodName : Tadka Vegetables
         * FoodRecepiee : tadka vegetables, baby spinach roasted sesam
         * FoodPrice : 1400
         * FoodCategory : veg
         * FoodThumb : http://rjtmobile.com/ansari/fos/admin/uploads/food_menu_pics/tadka_veg.jpg
         */



        private String FoodId;
        private String FoodName;
        private String FoodRecepiee;
        private String FoodPrice;
        private String FoodCategory;
        private String FoodThumb;

        public static FoodBean objectFromData(String str) {

            return new Gson().fromJson(str, FoodBean.class);
        }

        public String getFoodId() {
            return FoodId;
        }

        public void setFoodId(String FoodId) {
            this.FoodId = FoodId;
        }

        public String getFoodName() {
            return FoodName;
        }

        public void setFoodName(String FoodName) {
            this.FoodName = FoodName;
        }

        public String getFoodRecepiee() {
            return FoodRecepiee;
        }

        public void setFoodRecepiee(String FoodRecepiee) {
            this.FoodRecepiee = FoodRecepiee;
        }

        public String getFoodPrice() {
            return FoodPrice;
        }

        public void setFoodPrice(String FoodPrice) {
            this.FoodPrice = FoodPrice;
        }

        public String getFoodCategory() {
            return FoodCategory;
        }

        public void setFoodCategory(String FoodCategory) {
            this.FoodCategory = FoodCategory;
        }

        public String getFoodThumb() {
            return FoodThumb;
        }

        public void setFoodThumb(String FoodThumb) {
            this.FoodThumb = FoodThumb;
        }
    }
}
