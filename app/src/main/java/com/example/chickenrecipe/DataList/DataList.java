package com.example.chickenrecipe.DataList;

import android.content.Context;


import com.example.chickenrecipe.Model.Data;
import com.example.chickenrecipe.R;

import java.util.ArrayList;

public class DataList {
    Context context;

    public DataList(Context context) {
        this.context = context;
    }

    private ArrayList<Data> getAsianRecipes() {
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.asian1, context.getString(R.string.asian_chicken_and_pasta_salad_title),
                context.getString(R.string.asian_chicken_and_pasta_salad_time), context.getString(R.string.asian_chicken_and_pasta_salad_calories),
                context.getString(R.string.asian_chicken_and_pasta_salad_fats), context.getString(R.string.asian_chicken_and_pasta_salad_proteins),
                context.getString(R.string.asian_chicken_and_pasta_salad_ingredients), context.getString(R.string.asian_chicken_and_pasta_salad_instruction)));

        dataList.add(new Data(R.drawable.asian2, context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_title),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_time), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_calories),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_fats), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_proteins),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_ingredients), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_instruction)));

        dataList.add(new Data(R.drawable.asian3, context.getString(R.string.crock_pot_potato_chowder_title),
                context.getString(R.string.crock_pot_potato_chowder_time), context.getString(R.string.crock_pot_potato_chowder_calories),
                context.getString(R.string.crock_pot_potato_chowder_fats), context.getString(R.string.crock_pot_potato_chowder_proteins),
                context.getString(R.string.crock_pot_potato_chowder_ingredients), context.getString(R.string.crock_pot_potato_chowder_instructions)));

        dataList.add(new Data(R.drawable.asian4, context.getString(R.string.easy_baked_potato_wedges_title),
                context.getString(R.string.easy_baked_potato_wedges_time), context.getString(R.string.easy_baked_potato_wedges_calories),
                context.getString(R.string.easy_baked_potato_wedges_fats), context.getString(R.string.easy_baked_potato_wedges_proteins),
                context.getString(R.string.easy_baked_potato_wedges_ingredients), context.getString(R.string.easy_baked_potato_wedges_instruction)));

        dataList.add(new Data(R.drawable.asian5, context.getString(R.string.potato_soup_title),
                context.getString(R.string.potato_soup_time), context.getString(R.string.potato_soup_calories),
                context.getString(R.string.potato_soup_fats), context.getString(R.string.potato_soup_proteins),
                context.getString(R.string.potato_soup_ingredients), context.getString(R.string.potato_soup_instruction)));

        dataList.add(new Data(R.drawable.asian6, context.getString(R.string.slow_cooker_cheesy_chicken_penne_title),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_time), context.getString(R.string.slow_cooker_cheesy_chicken_penne_calories),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_fats), context.getString(R.string.slow_cooker_cheesy_chicken_penne_proteins),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_ingredients), context.getString(R.string.slow_cooker_cheesy_chicken_penne_instruction)));

        dataList.add(new Data(R.drawable.asian7, context.getString(R.string.crock_pot_chicken_taco_meat_title),
                context.getString(R.string.crock_pot_chicken_taco_meat_time), context.getString(R.string.crock_pot_chicken_taco_meat_calories),
                context.getString(R.string.crock_pot_chicken_taco_meat_fats), context.getString(R.string.crock_pot_chicken_taco_meat_proteins),
                context.getString(R.string.crock_pot_chicken_taco_meat_ingredients), context.getString(R.string.crock_pot_chicken_taco_meat_instruction)));

        dataList.add(new Data(R.drawable.asian8, context.getString(R.string.mahogany_beef_stew_title),
                context.getString(R.string.mahogany_beef_stew_time), context.getString(R.string.mahogany_beef_stew_calories),
                context.getString(R.string.mahogany_beef_stew_fats), context.getString(R.string.mahogany_beef_stew_proteins),
                context.getString(R.string.mahogany_beef_stew_ingredients), context.getString(R.string.mahogany_beef_stew_instruction)));

        dataList.add(new Data(R.drawable.asian9, context.getString(R.string.chili_con_carne_title),
                context.getString(R.string.chili_con_carne_time), context.getString(R.string.chili_con_carne_calories),
                context.getString(R.string.chili_con_carne_fats), context.getString(R.string.chili_con_carne_proteins),
                context.getString(R.string.chili_con_carne_ingredients), context.getString(R.string.chili_con_carne_instruction)));

        dataList.add(new Data(R.drawable.asian10, context.getString(R.string.german_potato_salad_title),
                context.getString(R.string.german_potato_salad_time), context.getString(R.string.german_potato_salad_calories),
                context.getString(R.string.german_potato_salad_fats), context.getString(R.string.german_potato_salad_proteins),
                context.getString(R.string.german_potato_salad_ingredients), context.getString(R.string.german_potato_salad_instruction)));

        dataList.add(new Data(R.drawable.asian8, context.getString(R.string.german_cucumber_salad_title),
                context.getString(R.string.german_cucumber_salad_time), context.getString(R.string.german_cucumber_salad_calories),
                context.getString(R.string.german_cucumber_salad_fats), context.getString(R.string.german_cucumber_salad_proteins),
                context.getString(R.string.german_cucumber_salad_ingredients), context.getString(R.string.german_cucumber_salad_instruction)));

        dataList.add(new Data(R.drawable.asian12, context.getString(R.string.german_tomato_salad_title),
                context.getString(R.string.german_tomato_salad_time), context.getString(R.string.german_tomato_salad_calories),
                context.getString(R.string.german_tomato_salad_fats), context.getString(R.string.german_tomato_salad_proteins),
                context.getString(R.string.german_tomato_salad_ingredients), context.getString(R.string.german_tomato_salad_instruction)));

        return dataList;
    }

    private ArrayList<Data> getArabianRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.saudi1, context.getString(R.string.tempeh_chicken_salad_title),
                context.getString(R.string.tempeh_chicken_salad_time), context.getString(R.string.tempeh_chicken_salad_calories),
                context.getString(R.string.tempeh_chicken_salad_fats), context.getString(R.string.tempeh_chicken_salad_proteins),
                context.getString(R.string.tempeh_chicken_salad_ingredients), context.getString(R.string.tempeh_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi2, context.getString(R.string.white_bean_pumpkin_soup_title),
                context.getString(R.string.white_bean_pumpkin_soup_time), context.getString(R.string.white_bean_pumpkin_soup_calories),
                context.getString(R.string.white_bean_pumpkin_soup_fats), context.getString(R.string.white_bean_pumpkin_soup_proteins),
                context.getString(R.string.white_bean_pumpkin_soup_ingredients), context.getString(R.string.white_bean_pumpkin_soup_instruction)));

        dataList.add(new Data(R.drawable.saudi3, context.getString(R.string.heather_stir_fry_sauce_title),
                context.getString(R.string.heather_stir_fry_sauce_time), context.getString(R.string.heather_stir_fry_sauce_calories),
                context.getString(R.string.heather_stir_fry_sauce_fats), context.getString(R.string.heather_stir_fry_sauce_proteins),
                context.getString(R.string.heather_stir_fry_sauce_ingredients), context.getString(R.string.heather_stir_fry_sauce_instruction)));

        dataList.add(new Data(R.drawable.saudi4, context.getString(R.string.kale_chips_title),
                context.getString(R.string.kale_chips_time), context.getString(R.string.kale_chips_calories),
                context.getString(R.string.kale_chips_fats), context.getString(R.string.kale_chips_proteins),
                context.getString(R.string.kale_chips_ingredients), context.getString(R.string.kale_chips_instruction)));

        dataList.add(new Data(R.drawable.saudi5, context.getString(R.string.cucumber_tomato_salad_title),
                context.getString(R.string.cucumber_tomato_salad_time), context.getString(R.string.cucumber_tomato_salad_calories),
                context.getString(R.string.cucumber_tomato_salad_fats), context.getString(R.string.cucumber_tomato_salad_proteins),
                context.getString(R.string.cucumber_tomato_salad_ingredients), context.getString(R.string.cucumber_tomato_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi6, context.getString(R.string.garden_vegetable_soup_title),
                context.getString(R.string.garden_vegetable_soup_time), context.getString(R.string.garden_vegetable_soup_calories),
                context.getString(R.string.garden_vegetable_soup_fats), context.getString(R.string.garden_vegetable_soup_proteins),
                context.getString(R.string.garden_vegetable_soup_ingredients), context.getString(R.string.garden_vegetable_soup_instruction)));

        dataList.add(new Data(R.drawable.saudi7, context.getString(R.string.roasted_root_vegetable_title),
                context.getString(R.string.roasted_root_vegetable_time), context.getString(R.string.roasted_root_vegetable_calories),
                context.getString(R.string.roasted_root_vegetable_fats), context.getString(R.string.roasted_root_vegetable_proteins),
                context.getString(R.string.roasted_root_vegetable_ingredients), context.getString(R.string.roasted_root_vegetable_instruction)));

        dataList.add(new Data(R.drawable.saudi8, context.getString(R.string.roasted_green_beans_title),
                context.getString(R.string.roasted_green_beans_time), context.getString(R.string.roasted_green_beans_calories),
                context.getString(R.string.roasted_green_beans_fats), context.getString(R.string.roasted_green_beans_proteins),
                context.getString(R.string.roasted_green_beans_ingredients), context.getString(R.string.roasted_green_beans_instruction)));

        dataList.add(new Data(R.drawable.saudi9, context.getString(R.string.vegan_almond_biscotti_title),
                context.getString(R.string.vegan_almond_biscotti_time), context.getString(R.string.vegan_almond_biscotti_calories),
                context.getString(R.string.vegan_almond_biscotti_fats), context.getString(R.string.vegan_almond_biscotti_proteins),
                context.getString(R.string.vegan_almond_biscotti_ingredients), context.getString(R.string.vegan_almond_biscotti_instruction)));

        dataList.add(new Data(R.drawable.saudi10, context.getString(R.string.easy_vegan_pancakes_title),
                context.getString(R.string.easy_vegan_pancakes_time), context.getString(R.string.easy_vegan_pancakes_calories),
                context.getString(R.string.easy_vegan_pancakes_fats), context.getString(R.string.easy_vegan_pancakes_proteins),
                context.getString(R.string.easy_vegan_pancakes_ingredients), context.getString(R.string.easy_vegan_pancakes_instruction)));

        dataList.add(new Data(R.drawable.saudi11, context.getString(R.string.apple_salad_title),
                context.getString(R.string.apple_salad_time), context.getString(R.string.apple_salad_calories),
                context.getString(R.string.apple_salad_fats), context.getString(R.string.apple_salad_proteins),
                context.getString(R.string.apple_salad_ingredients), context.getString(R.string.apple_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi12, context.getString(R.string.strawberry_salad_title),
                context.getString(R.string.strawberry_salad_time), context.getString(R.string.strawberry_salad_calories),
                context.getString(R.string.strawberry_salad_fats), context.getString(R.string.strawberry_salad_proteins),
                context.getString(R.string.strawberry_salad_ingredients), context.getString(R.string.strawberry_salad_instruction)));

        return  dataList;
    }

    private ArrayList<Data> getItalianRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.italian1, context.getString(R.string.scalloped_potatoes_title),
                context.getString(R.string.scalloped_potatoes_time), context.getString(R.string.scalloped_potatoes_calories),
                context.getString(R.string.scalloped_potatoes_fats), context.getString(R.string.scalloped_potatoes_proteins),
                context.getString(R.string.scalloped_potatoes_ingredients), context.getString(R.string.scalloped_potatoes_instruction)));

        dataList.add(new Data(R.drawable.italian2, context.getString(R.string.classic_chicken_salad_title),
                context.getString(R.string.classic_chicken_salad_time), context.getString(R.string.classic_chicken_salad_calories),
                context.getString(R.string.classic_chicken_salad_fats), context.getString(R.string.classic_chicken_salad_proteins),
                context.getString(R.string.classic_chicken_salad_ingredients), context.getString(R.string.classic_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.italian3, context.getString(R.string.jalapeno_chicken_salad_title),
                context.getString(R.string.jalapeno_chicken_salad_time), context.getString(R.string.jalapeno_chicken_salad_calories),
                context.getString(R.string.jalapeno_chicken_salad_fats), context.getString(R.string.jalapeno_chicken_salad_proteins),
                context.getString(R.string.jalapeno_chicken_salad_ingredients), context.getString(R.string.jalapeno_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.italian4, context.getString(R.string.crock_pot_whole_chicken_title),
                context.getString(R.string.crock_pot_whole_chicken_time), context.getString(R.string.crock_pot_whole_chicken_calories),
                context.getString(R.string.crock_pot_whole_chicken_fats), context.getString(R.string.crock_pot_whole_chicken_proteins),
                context.getString(R.string.crock_pot_whole_chicken_ingredients), context.getString(R.string.crock_pot_whole_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian5, context.getString(R.string.crock_pot_cheesy_chicken_title),
                context.getString(R.string.crock_pot_cheesy_chicken_time), context.getString(R.string.crock_pot_cheesy_chicken_calories),
                context.getString(R.string.crock_pot_cheesy_chicken_fats), context.getString(R.string.crock_pot_cheesy_chicken_proteins),
                context.getString(R.string.crock_pot_cheesy_chicken_ingredients), context.getString(R.string.crock_pot_cheesy_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian6, context.getString(R.string.tandoori_salmon_title),
                context.getString(R.string.tandoori_salmon_time), context.getString(R.string.tandoori_salmon_calories),
                context.getString(R.string.tandoori_salmon_fats), context.getString(R.string.tandoori_salmon_proteins),
                context.getString(R.string.tandoori_salmon_ingredients), context.getString(R.string.tandoori_salmon_instruction)));

        dataList.add(new Data(R.drawable.italian7, context.getString(R.string.cashew_chicken_curry_title),
                context.getString(R.string.cashew_chicken_curry_time), context.getString(R.string.cashew_chicken_curry_calories),
                context.getString(R.string.cashew_chicken_curry_fats), context.getString(R.string.cashew_chicken_curry_proteins),
                context.getString(R.string.cashew_chicken_curry_ingredients), context.getString(R.string.cashew_chicken_curry_instruction)));

        dataList.add(new Data(R.drawable.italian8, context.getString(R.string.winnipeg_chicken_curry_title),
                context.getString(R.string.winnipeg_chicken_curry_time), context.getString(R.string.winnipeg_chicken_curry_calories),
                context.getString(R.string.winnipeg_chicken_curry_fats), context.getString(R.string.winnipeg_chicken_curry_proteins),
                context.getString(R.string.winnipeg_chicken_curry_ingredients), context.getString(R.string.winnipeg_chicken_curry_instruction)));

        dataList.add(new Data(R.drawable.italian9, context.getString(R.string.chili_chicken_title),
                context.getString(R.string.chili_chicken_time), context.getString(R.string.chili_chicken_calories),
                context.getString(R.string.chili_chicken_fats), context.getString(R.string.chili_chicken_proteins),
                context.getString(R.string.chili_chicken_ingredients), context.getString(R.string.chili_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian10, context.getString(R.string.italian_salad_dressing_title),
                context.getString(R.string.italian_salad_dressing_time), context.getString(R.string.italian_salad_dressing_calories),
                context.getString(R.string.italian_salad_dressing_fats), context.getString(R.string.italian_salad_dressing_proteins),
                context.getString(R.string.italian_salad_dressing_ingredients), context.getString(R.string.italian_salad_dressing_instruction)));

        dataList.add(new Data(R.drawable.italian11, context.getString(R.string.award_winning_chili_title),
                context.getString(R.string.award_winning_chili_time), context.getString(R.string.award_winning_chili_calories),
                context.getString(R.string.award_winning_chili_fats), context.getString(R.string.award_winning_chili_proteins),
                context.getString(R.string.award_winning_chili_ingredients), context.getString(R.string.award_winning_chili_instruction)));

        dataList.add(new Data(R.drawable.italian12, context.getString(R.string.bourbon_chicken_title),
                context.getString(R.string.bourbon_chicken_time), context.getString(R.string.bourbon_chicken_calories),
                context.getString(R.string.bourbon_chicken_fats), context.getString(R.string.bourbon_chicken_proteins),
                context.getString(R.string.bourbon_chicken_ingredients), context.getString(R.string.bourbon_chicken_instruction)));

        return dataList;
    }

    private ArrayList<Data> getMexicanRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.mexi1, context.getString(R.string.roasted_potato_salad_title),
                context.getString(R.string.roasted_potato_salad_time), context.getString(R.string.roasted_potato_salad_calories),
                context.getString(R.string.roasted_potato_salad_fats), context.getString(R.string.roasted_potato_salad_proteins),
                context.getString(R.string.roasted_potato_salad_ingredients), context.getString(R.string.roasted_potato_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi2, context.getString(R.string.crock_pot_rice_pudding_title),
                context.getString(R.string.crock_pot_rice_pudding_time), context.getString(R.string.crock_pot_rice_pudding_calories),
                context.getString(R.string.crock_pot_rice_pudding_fats), context.getString(R.string.crock_pot_rice_pudding_proteins),
                context.getString(R.string.crock_pot_rice_pudding_ingredients), context.getString(R.string.crock_pot_rice_pudding_instruction)));

        dataList.add(new Data(R.drawable.mexi3, context.getString(R.string.tandoori_chicken_title),
                context.getString(R.string.tandoori_chicken_time), context.getString(R.string.tandoori_chicken_calories),
                context.getString(R.string.tandoori_chicken_fats), context.getString(R.string.tandoori_chicken_proteins),
                context.getString(R.string.tandoori_chicken_ingredients), context.getString(R.string.tandoori_chicken_instruction)));

        dataList.add(new Data(R.drawable.mexi4, context.getString(R.string.black_bean_couscous_salad_title),
                context.getString(R.string.black_bean_couscous_salad_time), context.getString(R.string.black_bean_couscous_salad_calories),
                context.getString(R.string.black_bean_couscous_salad_fats), context.getString(R.string.black_bean_couscous_salad_proteins),
                context.getString(R.string.black_bean_couscous_salad_ingredients), context.getString(R.string.black_bean_couscous_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi5, context.getString(R.string.chicken_noodle_soup_title),
                context.getString(R.string.chicken_noodle_soup_time), context.getString(R.string.chicken_noodle_soup_calories),
                context.getString(R.string.chicken_noodle_soup_fats), context.getString(R.string.chicken_noodle_soup_proteins),
                context.getString(R.string.chicken_noodle_soup_ingredients), context.getString(R.string.chicken_noodle_soup_instruction)));

        dataList.add(new Data(R.drawable.mexi6, context.getString(R.string.chicken_tortilla_soup_title),
                context.getString(R.string.chicken_tortilla_soup_time), context.getString(R.string.chicken_tortilla_soup_calories),
                context.getString(R.string.chicken_tortilla_soup_fats), context.getString(R.string.chicken_tortilla_soup_proteins),
                context.getString(R.string.chicken_tortilla_soup_ingredients), context.getString(R.string.chicken_tortilla_soup_instruction)));

        dataList.add(new Data(R.drawable.mexi7, context.getString(R.string.creamy_garlic_penne_pasta_title),
                context.getString(R.string.creamy_garlic_penne_pasta_time), context.getString(R.string.creamy_garlic_penne_pasta_calories),
                context.getString(R.string.creamy_garlic_penne_pasta_fats), context.getString(R.string.creamy_garlic_penne_pasta_proteins),
                context.getString(R.string.creamy_garlic_penne_pasta_ingredients), context.getString(R.string.creamy_garlic_penne_pasta_instruction)));

        dataList.add(new Data(R.drawable.mexi8, context.getString(R.string.baked_parmesan_fish_title),
                context.getString(R.string.baked_parmesan_fish_time), context.getString(R.string.baked_parmesan_fish_calories),
                context.getString(R.string.baked_parmesan_fish_fats), context.getString(R.string.baked_parmesan_fish_proteins),
                context.getString(R.string.baked_parmesan_fish_ingredients), context.getString(R.string.baked_parmesan_fish_instruction)));

        dataList.add(new Data(R.drawable.mexi9, context.getString(R.string.greek_baked_fish_title),
                context.getString(R.string.greek_baked_fish_time), context.getString(R.string.greek_baked_fish_calories),
                context.getString(R.string.greek_baked_fish_fats), context.getString(R.string.greek_baked_fish_proteins),
                context.getString(R.string.greek_baked_fish_ingredients), context.getString(R.string.greek_baked_fish_instruction)));

        dataList.add(new Data(R.drawable.mexi10, context.getString(R.string.dutch_cucumber_salad_title),
                context.getString(R.string.dutch_cucumber_salad_time), context.getString(R.string.dutch_cucumber_salad_calories),
                context.getString(R.string.dutch_cucumber_salad_fats), context.getString(R.string.dutch_cucumber_salad_proteins),
                context.getString(R.string.dutch_cucumber_salad_ingredients), context.getString(R.string.dutch_cucumber_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi11, context.getString(R.string.crispy_ginger_beef_title),
                context.getString(R.string.crispy_ginger_beef_time), context.getString(R.string.crispy_ginger_beef_calories),
                context.getString(R.string.crispy_ginger_beef_fats), context.getString(R.string.crispy_ginger_beef_proteins),
                context.getString(R.string.crispy_ginger_beef_ingredients), context.getString(R.string.crispy_ginger_beef_instruction)));

        dataList.add(new Data(R.drawable.mexi12, context.getString(R.string.crock_pot_stuffing_title),
                context.getString(R.string.crock_pot_stuffing_time), context.getString(R.string.crock_pot_stuffing_calories),
                context.getString(R.string.crock_pot_stuffing_fats), context.getString(R.string.crock_pot_stuffing_proteins),
                context.getString(R.string.crock_pot_stuffing_ingredients), context.getString(R.string.crock_pot_stuffing_instruction)));

        return dataList;
    }

    private ArrayList<Data> getCheesyChickenRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.cheesy1, context.getString(R.string.golden_chicken_nuggets_title),
                context.getString(R.string.golden_chicken_nuggets_time), context.getString(R.string.golden_chicken_nuggets_calories),
                context.getString(R.string.golden_chicken_nuggets_fats), context.getString(R.string.golden_chicken_nuggets_proteins),
                context.getString(R.string.golden_chicken_nuggets_ingredients), context.getString(R.string.golden_chicken_nuggets_instruction)));

        dataList.add(new Data(R.drawable.cheesy2, context.getString(R.string.cajun_chicken_drumsticks_title),
                context.getString(R.string.cajun_chicken_drumsticks_time), context.getString(R.string.cajun_chicken_drumsticks_calories),
                context.getString(R.string.cajun_chicken_drumsticks_fats), context.getString(R.string.cajun_chicken_drumsticks_proteins),
                context.getString(R.string.cajun_chicken_drumsticks_ingredients), context.getString(R.string.cajun_chicken_drumsticks_instruction)));

        dataList.add(new Data(R.drawable.cheesy3, context.getString(R.string.white_chicken_chili_title),
                context.getString(R.string.white_chicken_chili_time), context.getString(R.string.white_chicken_chili_calories),
                context.getString(R.string.white_chicken_chili_fats), context.getString(R.string.white_chicken_chili_proteins),
                context.getString(R.string.white_chicken_chili_ingredients), context.getString(R.string.white_chicken_chili_instruction)));

        dataList.add(new Data(R.drawable.cheesy4, context.getString(R.string.chicken_shrimp_pasta_title),
                context.getString(R.string.chicken_shrimp_pasta_time), context.getString(R.string.chicken_shrimp_pasta_calories),
                context.getString(R.string.chicken_shrimp_pasta_fats), context.getString(R.string.chicken_shrimp_pasta_proteins),
                context.getString(R.string.chicken_shrimp_pasta_ingredients), context.getString(R.string.chicken_shrimp_pasta_instruction)));

        dataList.add(new Data(R.drawable.cheesy5, context.getString(R.string.chicken_taco_casserole_title),
                context.getString(R.string.chicken_taco_casserole_time), context.getString(R.string.chicken_taco_casserole_calories),
                context.getString(R.string.chicken_taco_casserole_fats), context.getString(R.string.chicken_taco_casserole_proteins),
                context.getString(R.string.chicken_taco_casserole_ingredients), context.getString(R.string.chicken_taco_casserole_instruction)));

        dataList.add(new Data(R.drawable.cheesy6, context.getString(R.string.easy_balsamic_chicken_title),
                context.getString(R.string.easy_balsamic_chicken_time), context.getString(R.string.easy_balsamic_chicken_calories),
                context.getString(R.string.easy_balsamic_chicken_fats), context.getString(R.string.easy_balsamic_chicken_proteins),
                context.getString(R.string.easy_balsamic_chicken_ingredients), context.getString(R.string.easy_balsamic_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy7, context.getString(R.string.roasted_balsamic_chicken_title),
                context.getString(R.string.roasted_balsamic_chicken_time), context.getString(R.string.roasted_balsamic_chicken_calories),
                context.getString(R.string.roasted_balsamic_chicken_fats), context.getString(R.string.roasted_balsamic_chicken_proteins),
                context.getString(R.string.roasted_balsamic_chicken_ingredients), context.getString(R.string.roasted_balsamic_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy8, context.getString(R.string.baked_chicken_teriyaki_title),
                context.getString(R.string.baked_chicken_teriyaki_time), context.getString(R.string.baked_chicken_teriyaki_calories),
                context.getString(R.string.baked_chicken_teriyaki_fats), context.getString(R.string.baked_chicken_teriyaki_proteins),
                context.getString(R.string.baked_chicken_teriyaki_ingredients), context.getString(R.string.baked_chicken_teriyaki_instruction)));

        dataList.add(new Data(R.drawable.cheesy9, context.getString(R.string.grilled_teriyaki_chicken_title),
                context.getString(R.string.grilled_teriyaki_chicken_time), context.getString(R.string.grilled_teriyaki_chicken_calories),
                context.getString(R.string.grilled_teriyaki_chicken_fats), context.getString(R.string.grilled_teriyaki_chicken_proteins),
                context.getString(R.string.grilled_teriyaki_chicken_ingredients), context.getString(R.string.grilled_teriyaki_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy10, context.getString(R.string.baked_chicken_fajitas_title),
                context.getString(R.string.baked_chicken_fajitas_time), context.getString(R.string.baked_chicken_fajitas_calories),
                context.getString(R.string.baked_chicken_fajitas_fats), context.getString(R.string.baked_chicken_fajitas_proteins),
                context.getString(R.string.baked_chicken_fajitas_ingredients), context.getString(R.string.baked_chicken_fajitas_instruction)));

        dataList.add(new Data(R.drawable.cheesy11, context.getString(R.string.best_chicken_fajitas_title),
                context.getString(R.string.best_chicken_fajitas_time), context.getString(R.string.best_chicken_fajitas_calories),
                context.getString(R.string.best_chicken_fajitas_fats), context.getString(R.string.best_chicken_fajitas_proteins),
                context.getString(R.string.best_chicken_fajitas_ingredients), context.getString(R.string.best_chicken_fajitas_instruction)));

        dataList.add(new Data(R.drawable.cheesy12, context.getString(R.string.chili_chicken_fajitas_title),
                context.getString(R.string.chili_chicken_fajitas_time), context.getString(R.string.chili_chicken_fajitas_calories),
                context.getString(R.string.chili_chicken_fajitas_fats), context.getString(R.string.chili_chicken_fajitas_proteins),
                context.getString(R.string.chili_chicken_fajitas_ingredients), context.getString(R.string.chili_chicken_fajitas_instruction)));

        return dataList;
    }

    private ArrayList<Data> getSweetChickenRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.sweet1, context.getString(R.string.coconut_lime_chicken_title),
                context.getString(R.string.coconut_lime_chicken_time), context.getString(R.string.coconut_lime_chicken_calories),
                context.getString(R.string.coconut_lime_chicken_fats), context.getString(R.string.coconut_lime_chicken_proteins),
                context.getString(R.string.coconut_lime_chicken_ingredients), context.getString(R.string.coconut_lime_chicken_instruction)));


        dataList.add(new Data(R.drawable.sweet1, context.getString(R.string.coconut_lime_chicken_title),
                context.getString(R.string.honey_glazed_chicken_time), context.getString(R.string.honey_glazed_chicken_calories),
                context.getString(R.string.honey_glazed_chicken_fats), context.getString(R.string.honey_glazed_chicken_proteins),
                context.getString(R.string.honey_glazed_chicken_ingredients), context.getString(R.string.honey_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet2, context.getString(R.string.apricot_glazed_chicken_title),
                context.getString(R.string.apricot_glazed_chicken_time), context.getString(R.string.apricot_glazed_chicken_calories),
                context.getString(R.string.apricot_glazed_chicken_fats), context.getString(R.string.apricot_glazed_chicken_proteins),
                context.getString(R.string.apricot_glazed_chicken_ingredients), context.getString(R.string.apricot_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet3, context.getString(R.string.honey_chicken_thighs_title),
                context.getString(R.string.honey_chicken_thighs_time), context.getString(R.string.honey_chicken_thighs_calories),
                context.getString(R.string.honey_chicken_thighs_fats), context.getString(R.string.honey_chicken_thighs_proteins),
                context.getString(R.string.honey_chicken_thighs_ingredients), context.getString(R.string.honey_chicken_thighs_instruction)));

        dataList.add(new Data(R.drawable.sweet4, context.getString(R.string.orange_rosemary_chicken_title),
                context.getString(R.string.orange_rosemary_chicken_time), context.getString(R.string.orange_rosemary_chicken_calories),
                context.getString(R.string.orange_rosemary_chicken_fats), context.getString(R.string.orange_rosemary_chicken_proteins),
                context.getString(R.string.orange_rosemary_chicken_ingredients), context.getString(R.string.orange_rosemary_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet5, context.getString(R.string.honey_sriacha_chicken_leg_title),
                context.getString(R.string.honey_sriacha_chicken_leg_time), context.getString(R.string.honey_sriacha_chicken_leg_calories),
                context.getString(R.string.honey_sriacha_chicken_leg_fats), context.getString(R.string.honey_sriacha_chicken_leg_proteins),
                context.getString(R.string.honey_sriacha_chicken_leg_ingredients), context.getString(R.string.honey_sriacha_chicken_leg_instruction)));

        dataList.add(new Data(R.drawable.sweet6, context.getString(R.string.baked_honey_garlic_chicken_title),
                context.getString(R.string.baked_honey_garlic_chicken_time), context.getString(R.string.baked_honey_garlic_chicken_calories),
                context.getString(R.string.baked_honey_garlic_chicken_fats), context.getString(R.string.baked_honey_garlic_chicken_proteins),
                context.getString(R.string.baked_honey_garlic_chicken_ingredients), context.getString(R.string.baked_honey_garlic_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet7, context.getString(R.string.fig_glazed_chicken_title),
                context.getString(R.string.fig_glazed_chicken_time), context.getString(R.string.fig_glazed_chicken_calories),
                context.getString(R.string.fig_glazed_chicken_fats), context.getString(R.string.fig_glazed_chicken_proteins),
                context.getString(R.string.fig_glazed_chicken_ingredients), context.getString(R.string.fig_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet8, context.getString(R.string.honey_sesame_chicken_title),
                context.getString(R.string.honey_sesame_chicken_time), context.getString(R.string.honey_sesame_chicken_calories),
                context.getString(R.string.honey_sesame_chicken_fats), context.getString(R.string.honey_sesame_chicken_proteins),
                context.getString(R.string.honey_sesame_chicken_ingredients), context.getString(R.string.honey_sesame_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet9, context.getString(R.string.mango_chili_chicken_title),
                context.getString(R.string.mango_chili_chicken_time), context.getString(R.string.mango_chili_chicken_calories),
                context.getString(R.string.mango_chili_chicken_fats), context.getString(R.string.mango_chili_chicken_proteins),
                context.getString(R.string.mango_chili_chicken_ingredients), context.getString(R.string.mango_chili_chicken_instruction)));

        return dataList;
    }

    private ArrayList<Data> getChickenKievRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.kiev1, context.getString(R.string.baked_chicken_kiev_title),
                context.getString(R.string.baked_chicken_kiev_time), context.getString(R.string.baked_chicken_kiev_calories),
                context.getString(R.string.baked_chicken_kiev_fats), context.getString(R.string.baked_chicken_kiev_proteins),
                context.getString(R.string.baked_chicken_kiev_ingredients), context.getString(R.string.baked_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev2, context.getString(R.string.authentic_chicken_parmesan_title),
                context.getString(R.string.authentic_chicken_parmesan_time), context.getString(R.string.authentic_chicken_parmesan_calories),
                context.getString(R.string.authentic_chicken_parmesan_fats), context.getString(R.string.authentic_chicken_parmesan_proteins),
                context.getString(R.string.authentic_chicken_parmesan_ingredients), context.getString(R.string.authentic_chicken_parmesan_instruction)));

        dataList.add(new Data(R.drawable.kiev3, context.getString(R.string.classic_chicken_kiev_title),
                context.getString(R.string.classic_chicken_kiev_time), context.getString(R.string.classic_chicken_kiev_calories),
                context.getString(R.string.classic_chicken_kiev_fats), context.getString(R.string.classic_chicken_kiev_proteins),
                context.getString(R.string.classic_chicken_kiev_ingredients), context.getString(R.string.classic_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev4, context.getString(R.string.garlic_hub_kiev_title),
                context.getString(R.string.garlic_hub_kiev_time), context.getString(R.string.garlic_hub_kiev_calories),
                context.getString(R.string.garlic_hub_kiev_fats), context.getString(R.string.garlic_hub_kiev_proteins),
                context.getString(R.string.garlic_hub_kiev_ingredients), context.getString(R.string.garlic_hub_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev5, context.getString(R.string.lemon_butter_kiev_title),
                context.getString(R.string.lemon_butter_kiev_time), context.getString(R.string.lemon_butter_kiev_calories),
                context.getString(R.string.lemon_butter_kiev_fats), context.getString(R.string.lemon_butter_kiev_proteins),
                context.getString(R.string.lemon_butter_kiev_ingredients), context.getString(R.string.lemon_butter_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev6, context.getString(R.string.teriyaki_chicken_kiev_title),
                context.getString(R.string.teriyaki_chicken_kiev_time), context.getString(R.string.teriyaki_chicken_kiev_calories),
                context.getString(R.string.teriyaki_chicken_kiev_fats), context.getString(R.string.teriyaki_chicken_kiev_proteins),
                context.getString(R.string.teriyaki_chicken_kiev_ingredients), context.getString(R.string.teriyaki_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev7, context.getString(R.string.mushroom_swiss_kiev_title),
                context.getString(R.string.mushroom_swiss_kiev_time), context.getString(R.string.mushroom_swiss_kiev_calories),
                context.getString(R.string.mushroom_swiss_kiev_fats), context.getString(R.string.mushroom_swiss_kiev_proteins),
                context.getString(R.string.mushroom_swiss_kiev_ingredients), context.getString(R.string.mushroom_swiss_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev8, context.getString(R.string.bacon_wrapped_kiev_title),
                context.getString(R.string.bacon_wrapped_kiev_time), context.getString(R.string.bacon_wrapped_kiev_calories),
                context.getString(R.string.bacon_wrapped_kiev_fats), context.getString(R.string.bacon_wrapped_kiev_proteins),
                context.getString(R.string.bacon_wrapped_kiev_ingredients), context.getString(R.string.bacon_wrapped_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev9, context.getString(R.string.dijon_mustard_kiev_title),
                context.getString(R.string.dijon_mustard_kiev_time), context.getString(R.string.dijon_mustard_kiev_calories),
                context.getString(R.string.dijon_mustard_kiev_fats), context.getString(R.string.dijon_mustard_kiev_proteins),
                context.getString(R.string.dijon_mustard_kiev_ingredients), context.getString(R.string.dijon_mustard_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev10, context.getString(R.string.spinach_feta_kiev),
                context.getString(R.string.spinach_feta_kiev_time), context.getString(R.string.spinach_feta_kiev_calories),
                context.getString(R.string.spinach_feta_kiev_fats), context.getString(R.string.spinach_feta_kiev_proteins),
                context.getString(R.string.spinach_feta_kiev_ingredients), context.getString(R.string.spinach_feta_kiev_instruction)));

        return dataList;
    }

    private ArrayList<Data> getSalsaChickenRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.salsa1, context.getString(R.string.creamy_salsa_chicken_title),
                context.getString(R.string.creamy_salsa_chicken_time), context.getString(R.string.creamy_salsa_chicken_calories),
                context.getString(R.string.creamy_salsa_chicken_fats), context.getString(R.string.creamy_salsa_chicken_proteins),
                context.getString(R.string.creamy_salsa_chicken_ingredients), context.getString(R.string.creamy_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa2, context.getString(R.string.mango_salsa_chicken_title),
                context.getString(R.string.mango_salsa_chicken_time), context.getString(R.string.mango_salsa_chicken_calories),
                context.getString(R.string.mango_salsa_chicken_fats), context.getString(R.string.mango_salsa_chicken_proteins),
                context.getString(R.string.mango_salsa_chicken_ingredients), context.getString(R.string.mango_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa3, context.getString(R.string.green_salsa_chicken_title),
                context.getString(R.string.green_salsa_chicken_time), context.getString(R.string.green_salsa_chicken_calories),
                context.getString(R.string.green_salsa_chicken_fats), context.getString(R.string.green_salsa_chicken_proteins),
                context.getString(R.string.green_salsa_chicken_ingredients), context.getString(R.string.green_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa4, context.getString(R.string.bake_salsa_chicken_title),
                context.getString(R.string.bake_salsa_chicken_time), context.getString(R.string.bake_salsa_chicken_calories),
                context.getString(R.string.bake_salsa_chicken_fats), context.getString(R.string.bake_salsa_chicken_proteins),
                context.getString(R.string.bake_salsa_chicken_ingredients), context.getString(R.string.bake_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa5, context.getString(R.string.verda_salsa_chicken_title),
                context.getString(R.string.verda_salsa_chicken_time), context.getString(R.string.verda_salsa_chicken_calories),
                context.getString(R.string.verda_salsa_chicken_fats), context.getString(R.string.verda_salsa_chicken_proteins),
                context.getString(R.string.verda_salsa_chicken_ingredients), context.getString(R.string.verda_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa6, context.getString(R.string.grilled_salsa_chicken_title),
                context.getString(R.string.grilled_salsa_chicken_time), context.getString(R.string.grilled_salsa_chicken_calories),
                context.getString(R.string.grilled_salsa_chicken_fats), context.getString(R.string.grilled_salsa_chicken_proteins),
                context.getString(R.string.grilled_salsa_chicken_ingredients), context.getString(R.string.grilled_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa7, context.getString(R.string.pineapple_salsa_chicken_title),
                context.getString(R.string.pineapple_salsa_chicken_time), context.getString(R.string.pineapple_salsa_chicken_calories),
                context.getString(R.string.pineapple_salsa_chicken_fats), context.getString(R.string.pineapple_salsa_chicken_proteins),
                context.getString(R.string.pineapple_salsa_chicken_ingredients), context.getString(R.string.pineapple_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa8, context.getString(R.string.mexican_salsa_chicken_title),
                context.getString(R.string.mexican_salsa_chicken_time), context.getString(R.string.mexican_salsa_chicken_calories),
                context.getString(R.string.mexican_salsa_chicken_fats), context.getString(R.string.mexican_salsa_chicken_proteins),
                context.getString(R.string.mexican_salsa_chicken_ingredients), context.getString(R.string.mexican_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa9, context.getString(R.string.bbq_salsa_chicken_title),
                context.getString(R.string.bbq_salsa_chicken_time), context.getString(R.string.bbq_salsa_chicken_calories),
                context.getString(R.string.bbq_salsa_chicken_fats), context.getString(R.string.bbq_salsa_chicken_proteins),
                context.getString(R.string.bbq_salsa_chicken_ingredients), context.getString(R.string.bbq_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa10, context.getString(R.string.buffalo_salsa_chicken_title),
                context.getString(R.string.buffalo_salsa_chicken_time), context.getString(R.string.buffalo_salsa_chicken_calories),
                context.getString(R.string.buffalo_salsa_chicken_fats), context.getString(R.string.buffalo_salsa_chicken_proteins),
                context.getString(R.string.buffalo_salsa_chicken_ingredients), context.getString(R.string.buffalo_salsa_chicken_instruction)));

        return dataList;
    }

    private ArrayList<Data> getSpiceLoverRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.spicy1, context.getString(R.string.spicy_chicken_spicy_title),
                context.getString(R.string.spicy_chicken_spicy_time), context.getString(R.string.spicy_chicken_spicy_calories),
                context.getString(R.string.spicy_chicken_spicy_fats), context.getString(R.string.spicy_chicken_spicy_proteins),
                context.getString(R.string.spicy_chicken_spicy_ingredients), context.getString(R.string.spicy_chicken_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy2, context.getString(R.string.spicy_garlic_spicy_title),
                context.getString(R.string.spicy_garlic_spicy_time), context.getString(R.string.spicy_garlic_spicy_calories),
                context.getString(R.string.spicy_garlic_spicy_fats), context.getString(R.string.spicy_garlic_spicy_proteins),
                context.getString(R.string.spicy_garlic_spicy_ingredients), context.getString(R.string.spicy_garlic_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy3, context.getString(R.string.buffalo_spicy_title),
                context.getString(R.string.buffalo_spicy_time), context.getString(R.string.buffalo_spicy_calories),
                context.getString(R.string.buffalo_spicy_fats), context.getString(R.string.buffalo_spicy_proteins),
                context.getString(R.string.buffalo_spicy_ingredients), context.getString(R.string.buffalo_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy4, context.getString(R.string.orange_spicy_title),
                context.getString(R.string.orange_spicy_time), context.getString(R.string.orange_spicy_calories),
                context.getString(R.string.orange_spicy_fats), context.getString(R.string.orange_spicy_proteins),
                context.getString(R.string.orange_spicy_ingredients), context.getString(R.string.orange_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy5, context.getString(R.string.satay_spicy_title),
                context.getString(R.string.satay_spicy_time), context.getString(R.string.satay_spicy_calories),
                context.getString(R.string.satay_spicy_fats), context.getString(R.string.satay_spicy_proteins),
                context.getString(R.string.satay_spicy_ingredients), context.getString(R.string.satay_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy6, context.getString(R.string.firecracker_spicy_title),
                context.getString(R.string.firecracker_spicy_time), context.getString(R.string.firecracker_spicy_calories),
                context.getString(R.string.firecracker_spicy_fats), context.getString(R.string.firecracker_spicy_proteins),
                context.getString(R.string.firecracker_spicy_ingredients), context.getString(R.string.firecracker_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy7, context.getString(R.string.coconut_spicy_title),
                context.getString(R.string.coconut_spicy_time), context.getString(R.string.coconut_spicy_calories),
                context.getString(R.string.coconut_spicy_fats), context.getString(R.string.coconut_spicy_proteins),
                context.getString(R.string.coconut_spicy_ingredients), context.getString(R.string.coconut_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy8, context.getString(R.string.chili_spicy_title),
                context.getString(R.string.chili_spicy_time), context.getString(R.string.chili_spicy_calories),
                context.getString(R.string.chili_spicy_fats), context.getString(R.string.chili_spicy_proteins),
                context.getString(R.string.chili_spicy_ingredients), context.getString(R.string.chili_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy9, context.getString(R.string.harissa_spicy_title),
                context.getString(R.string.harissa_spicy_time), context.getString(R.string.harissa_spicy_calories),
                context.getString(R.string.harissa_spicy_fats), context.getString(R.string.harissa_spicy_proteins),
                context.getString(R.string.harissa_spicy_ingredients), context.getString(R.string.harissa_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy10, context.getString(R.string.peri_spicy_title),
                context.getString(R.string.peri_spicy_time), context.getString(R.string.peri_spicy_calories),
                context.getString(R.string.peri_spicy_fats), context.getString(R.string.peri_spicy_proteins),
                context.getString(R.string.peri_spicy_ingredients), context.getString(R.string.peri_spicy_instruction)));

        return dataList;
    }

    private ArrayList<Data> getStuffedChickenRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.stuffed1, context.getString(R.string.asparagus_breasts_title),
                context.getString(R.string.asparagus_breasts_time), context.getString(R.string.asparagus_breasts_calories),
                context.getString(R.string.asparagus_breasts_fats), context.getString(R.string.asparagus_breasts_proteins),
                context.getString(R.string.asparagus_breasts_ingredients), context.getString(R.string.asparagus_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed2, context.getString(R.string.caprese_breasts_title),
                context.getString(R.string.caprese_breasts_time), context.getString(R.string.caprese_breasts_calories),
                context.getString(R.string.caprese_breasts_fats), context.getString(R.string.caprese_breasts_proteins),
                context.getString(R.string.caprese_breasts_ingredients), context.getString(R.string.caprese_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed3, context.getString(R.string.spinach_breasts_title),
                context.getString(R.string.spinach_breasts_time), context.getString(R.string.spinach_breasts_calories),
                context.getString(R.string.spinach_breasts_fats), context.getString(R.string.spinach_breasts_proteins),
                context.getString(R.string.spinach_breasts_ingredients), context.getString(R.string.spinach_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed4, context.getString(R.string.cheddar_breasts_title),
                context.getString(R.string.cheddar_breasts_time), context.getString(R.string.cheddar_breasts_calories),
                context.getString(R.string.cheddar_breasts_fats), context.getString(R.string.cheddar_breasts_proteins),
                context.getString(R.string.cheddar_breasts_ingredients), context.getString(R.string.cheddar_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed5, context.getString(R.string.mushroom_breasts_title),
                context.getString(R.string.mushroom_breasts_time), context.getString(R.string.mushroom_breasts_calories),
                context.getString(R.string.mushroom_breasts_fats), context.getString(R.string.mushroom_breasts_proteins),
                context.getString(R.string.mushroom_breasts_ingredients), context.getString(R.string.mushroom_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed6, context.getString(R.string.cheese_breasts_title),
                context.getString(R.string.cheese_breasts_time), context.getString(R.string.cheese_breasts_calories),
                context.getString(R.string.cheese_breasts_fats), context.getString(R.string.cheese_breasts_proteins),
                context.getString(R.string.cheese_breasts_ingredients), context.getString(R.string.cheese_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed7, context.getString(R.string.mozzarella_breasts_title),
                context.getString(R.string.mozzarella_breasts_time), context.getString(R.string.mozzarella_breasts_calories),
                context.getString(R.string.mozzarella_breasts_fats), context.getString(R.string.mozzarella_breasts_proteins),
                context.getString(R.string.mozzarella_breasts_ingredients), context.getString(R.string.mozzarella_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed8, context.getString(R.string.parmesan_breasts_title),
                context.getString(R.string.parmesan_breasts_time), context.getString(R.string.parmesan_breasts_calories),
                context.getString(R.string.parmesan_breasts_fats), context.getString(R.string.parmesan_breasts_proteins),
                context.getString(R.string.parmesan_breasts_ingredients), context.getString(R.string.parmesan_breasts_instruction)));

        return dataList;
    }

    public ArrayList<Data> getAllChickenRecipes(){
        ArrayList<Data> dataList = new ArrayList<>();

        // --->>> Cheesy Chicken Recipes

        dataList.add(new Data(R.drawable.cheesy1, context.getString(R.string.golden_chicken_nuggets_title),
                context.getString(R.string.golden_chicken_nuggets_time), context.getString(R.string.golden_chicken_nuggets_calories),
                context.getString(R.string.golden_chicken_nuggets_fats), context.getString(R.string.golden_chicken_nuggets_proteins),
                context.getString(R.string.golden_chicken_nuggets_ingredients), context.getString(R.string.golden_chicken_nuggets_instruction)));

        dataList.add(new Data(R.drawable.cheesy2, context.getString(R.string.cajun_chicken_drumsticks_title),
                context.getString(R.string.cajun_chicken_drumsticks_time), context.getString(R.string.cajun_chicken_drumsticks_calories),
                context.getString(R.string.cajun_chicken_drumsticks_fats), context.getString(R.string.cajun_chicken_drumsticks_proteins),
                context.getString(R.string.cajun_chicken_drumsticks_ingredients), context.getString(R.string.cajun_chicken_drumsticks_instruction)));

        dataList.add(new Data(R.drawable.cheesy3, context.getString(R.string.white_chicken_chili_title),
                context.getString(R.string.white_chicken_chili_time), context.getString(R.string.white_chicken_chili_calories),
                context.getString(R.string.white_chicken_chili_fats), context.getString(R.string.white_chicken_chili_proteins),
                context.getString(R.string.white_chicken_chili_ingredients), context.getString(R.string.white_chicken_chili_instruction)));

        dataList.add(new Data(R.drawable.cheesy4, context.getString(R.string.chicken_shrimp_pasta_title),
                context.getString(R.string.chicken_shrimp_pasta_time), context.getString(R.string.chicken_shrimp_pasta_calories),
                context.getString(R.string.chicken_shrimp_pasta_fats), context.getString(R.string.chicken_shrimp_pasta_proteins),
                context.getString(R.string.chicken_shrimp_pasta_ingredients), context.getString(R.string.chicken_shrimp_pasta_instruction)));

        dataList.add(new Data(R.drawable.cheesy5, context.getString(R.string.chicken_taco_casserole_title),
                context.getString(R.string.chicken_taco_casserole_time), context.getString(R.string.chicken_taco_casserole_calories),
                context.getString(R.string.chicken_taco_casserole_fats), context.getString(R.string.chicken_taco_casserole_proteins),
                context.getString(R.string.chicken_taco_casserole_ingredients), context.getString(R.string.chicken_taco_casserole_instruction)));

        dataList.add(new Data(R.drawable.cheesy6, context.getString(R.string.easy_balsamic_chicken_title),
                context.getString(R.string.easy_balsamic_chicken_time), context.getString(R.string.easy_balsamic_chicken_calories),
                context.getString(R.string.easy_balsamic_chicken_fats), context.getString(R.string.easy_balsamic_chicken_proteins),
                context.getString(R.string.easy_balsamic_chicken_ingredients), context.getString(R.string.easy_balsamic_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy7, context.getString(R.string.roasted_balsamic_chicken_title),
                context.getString(R.string.roasted_balsamic_chicken_time), context.getString(R.string.roasted_balsamic_chicken_calories),
                context.getString(R.string.roasted_balsamic_chicken_fats), context.getString(R.string.roasted_balsamic_chicken_proteins),
                context.getString(R.string.roasted_balsamic_chicken_ingredients), context.getString(R.string.roasted_balsamic_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy8, context.getString(R.string.baked_chicken_teriyaki_title),
                context.getString(R.string.baked_chicken_teriyaki_time), context.getString(R.string.baked_chicken_teriyaki_calories),
                context.getString(R.string.baked_chicken_teriyaki_fats), context.getString(R.string.baked_chicken_teriyaki_proteins),
                context.getString(R.string.baked_chicken_teriyaki_ingredients), context.getString(R.string.baked_chicken_teriyaki_instruction)));

        dataList.add(new Data(R.drawable.cheesy9, context.getString(R.string.grilled_teriyaki_chicken_title),
                context.getString(R.string.grilled_teriyaki_chicken_time), context.getString(R.string.grilled_teriyaki_chicken_calories),
                context.getString(R.string.grilled_teriyaki_chicken_fats), context.getString(R.string.grilled_teriyaki_chicken_proteins),
                context.getString(R.string.grilled_teriyaki_chicken_ingredients), context.getString(R.string.grilled_teriyaki_chicken_instruction)));

        dataList.add(new Data(R.drawable.cheesy10, context.getString(R.string.baked_chicken_fajitas_title),
                context.getString(R.string.baked_chicken_fajitas_time), context.getString(R.string.baked_chicken_fajitas_calories),
                context.getString(R.string.baked_chicken_fajitas_fats), context.getString(R.string.baked_chicken_fajitas_proteins),
                context.getString(R.string.baked_chicken_fajitas_ingredients), context.getString(R.string.baked_chicken_fajitas_instruction)));

        dataList.add(new Data(R.drawable.cheesy11, context.getString(R.string.best_chicken_fajitas_title),
                context.getString(R.string.best_chicken_fajitas_time), context.getString(R.string.best_chicken_fajitas_calories),
                context.getString(R.string.best_chicken_fajitas_fats), context.getString(R.string.best_chicken_fajitas_proteins),
                context.getString(R.string.best_chicken_fajitas_ingredients), context.getString(R.string.best_chicken_fajitas_instruction)));

        dataList.add(new Data(R.drawable.cheesy12, context.getString(R.string.chili_chicken_fajitas_title),
                context.getString(R.string.chili_chicken_fajitas_time), context.getString(R.string.chili_chicken_fajitas_calories),
                context.getString(R.string.chili_chicken_fajitas_fats), context.getString(R.string.chili_chicken_fajitas_proteins),
                context.getString(R.string.chili_chicken_fajitas_ingredients), context.getString(R.string.chili_chicken_fajitas_instruction)));

        // --->>> Mexican Chicken Recipes

        dataList.add(new Data(R.drawable.mexi1, context.getString(R.string.roasted_potato_salad_title),
                context.getString(R.string.roasted_potato_salad_time), context.getString(R.string.roasted_potato_salad_calories),
                context.getString(R.string.roasted_potato_salad_fats), context.getString(R.string.roasted_potato_salad_proteins),
                context.getString(R.string.roasted_potato_salad_ingredients), context.getString(R.string.roasted_potato_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi2, context.getString(R.string.crock_pot_rice_pudding_title),
                context.getString(R.string.crock_pot_rice_pudding_time), context.getString(R.string.crock_pot_rice_pudding_calories),
                context.getString(R.string.crock_pot_rice_pudding_fats), context.getString(R.string.crock_pot_rice_pudding_proteins),
                context.getString(R.string.crock_pot_rice_pudding_ingredients), context.getString(R.string.crock_pot_rice_pudding_instruction)));

        dataList.add(new Data(R.drawable.mexi3, context.getString(R.string.tandoori_chicken_title),
                context.getString(R.string.tandoori_chicken_time), context.getString(R.string.tandoori_chicken_calories),
                context.getString(R.string.tandoori_chicken_fats), context.getString(R.string.tandoori_chicken_proteins),
                context.getString(R.string.tandoori_chicken_ingredients), context.getString(R.string.tandoori_chicken_instruction)));

        dataList.add(new Data(R.drawable.mexi4, context.getString(R.string.black_bean_couscous_salad_title),
                context.getString(R.string.black_bean_couscous_salad_time), context.getString(R.string.black_bean_couscous_salad_calories),
                context.getString(R.string.black_bean_couscous_salad_fats), context.getString(R.string.black_bean_couscous_salad_proteins),
                context.getString(R.string.black_bean_couscous_salad_ingredients), context.getString(R.string.black_bean_couscous_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi5, context.getString(R.string.chicken_noodle_soup_title),
                context.getString(R.string.chicken_noodle_soup_time), context.getString(R.string.chicken_noodle_soup_calories),
                context.getString(R.string.chicken_noodle_soup_fats), context.getString(R.string.chicken_noodle_soup_proteins),
                context.getString(R.string.chicken_noodle_soup_ingredients), context.getString(R.string.chicken_noodle_soup_instruction)));

        dataList.add(new Data(R.drawable.mexi6, context.getString(R.string.chicken_tortilla_soup_title),
                context.getString(R.string.chicken_tortilla_soup_time), context.getString(R.string.chicken_tortilla_soup_calories),
                context.getString(R.string.chicken_tortilla_soup_fats), context.getString(R.string.chicken_tortilla_soup_proteins),
                context.getString(R.string.chicken_tortilla_soup_ingredients), context.getString(R.string.chicken_tortilla_soup_instruction)));

        dataList.add(new Data(R.drawable.mexi7, context.getString(R.string.creamy_garlic_penne_pasta_title),
                context.getString(R.string.creamy_garlic_penne_pasta_time), context.getString(R.string.creamy_garlic_penne_pasta_calories),
                context.getString(R.string.creamy_garlic_penne_pasta_fats), context.getString(R.string.creamy_garlic_penne_pasta_proteins),
                context.getString(R.string.creamy_garlic_penne_pasta_ingredients), context.getString(R.string.creamy_garlic_penne_pasta_instruction)));

        dataList.add(new Data(R.drawable.mexi8, context.getString(R.string.baked_parmesan_fish_title),
                context.getString(R.string.baked_parmesan_fish_time), context.getString(R.string.baked_parmesan_fish_calories),
                context.getString(R.string.baked_parmesan_fish_fats), context.getString(R.string.baked_parmesan_fish_proteins),
                context.getString(R.string.baked_parmesan_fish_ingredients), context.getString(R.string.baked_parmesan_fish_instruction)));

        dataList.add(new Data(R.drawable.mexi9, context.getString(R.string.greek_baked_fish_title),
                context.getString(R.string.greek_baked_fish_time), context.getString(R.string.greek_baked_fish_calories),
                context.getString(R.string.greek_baked_fish_fats), context.getString(R.string.greek_baked_fish_proteins),
                context.getString(R.string.greek_baked_fish_ingredients), context.getString(R.string.greek_baked_fish_instruction)));

        dataList.add(new Data(R.drawable.mexi10, context.getString(R.string.dutch_cucumber_salad_title),
                context.getString(R.string.dutch_cucumber_salad_time), context.getString(R.string.dutch_cucumber_salad_calories),
                context.getString(R.string.dutch_cucumber_salad_fats), context.getString(R.string.dutch_cucumber_salad_proteins),
                context.getString(R.string.dutch_cucumber_salad_ingredients), context.getString(R.string.dutch_cucumber_salad_instruction)));

        dataList.add(new Data(R.drawable.mexi11, context.getString(R.string.crispy_ginger_beef_title),
                context.getString(R.string.crispy_ginger_beef_time), context.getString(R.string.crispy_ginger_beef_calories),
                context.getString(R.string.crispy_ginger_beef_fats), context.getString(R.string.crispy_ginger_beef_proteins),
                context.getString(R.string.crispy_ginger_beef_ingredients), context.getString(R.string.crispy_ginger_beef_instruction)));

        dataList.add(new Data(R.drawable.mexi12, context.getString(R.string.crock_pot_stuffing_title),
                context.getString(R.string.crock_pot_stuffing_time), context.getString(R.string.crock_pot_stuffing_calories),
                context.getString(R.string.crock_pot_stuffing_fats), context.getString(R.string.crock_pot_stuffing_proteins),
                context.getString(R.string.crock_pot_stuffing_ingredients), context.getString(R.string.crock_pot_stuffing_instruction)));


        // --->>> Italian chicken Recipes

        dataList.add(new Data(R.drawable.italian1, context.getString(R.string.scalloped_potatoes_title),
                context.getString(R.string.scalloped_potatoes_time), context.getString(R.string.scalloped_potatoes_calories),
                context.getString(R.string.scalloped_potatoes_fats), context.getString(R.string.scalloped_potatoes_proteins),
                context.getString(R.string.scalloped_potatoes_ingredients), context.getString(R.string.scalloped_potatoes_instruction)));

        dataList.add(new Data(R.drawable.italian2, context.getString(R.string.classic_chicken_salad_title),
                context.getString(R.string.classic_chicken_salad_time), context.getString(R.string.classic_chicken_salad_calories),
                context.getString(R.string.classic_chicken_salad_fats), context.getString(R.string.classic_chicken_salad_proteins),
                context.getString(R.string.classic_chicken_salad_ingredients), context.getString(R.string.classic_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.italian3, context.getString(R.string.jalapeno_chicken_salad_title),
                context.getString(R.string.jalapeno_chicken_salad_time), context.getString(R.string.jalapeno_chicken_salad_calories),
                context.getString(R.string.jalapeno_chicken_salad_fats), context.getString(R.string.jalapeno_chicken_salad_proteins),
                context.getString(R.string.jalapeno_chicken_salad_ingredients), context.getString(R.string.jalapeno_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.italian4, context.getString(R.string.crock_pot_whole_chicken_title),
                context.getString(R.string.crock_pot_whole_chicken_time), context.getString(R.string.crock_pot_whole_chicken_calories),
                context.getString(R.string.crock_pot_whole_chicken_fats), context.getString(R.string.crock_pot_whole_chicken_proteins),
                context.getString(R.string.crock_pot_whole_chicken_ingredients), context.getString(R.string.crock_pot_whole_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian5, context.getString(R.string.crock_pot_cheesy_chicken_title),
                context.getString(R.string.crock_pot_cheesy_chicken_time), context.getString(R.string.crock_pot_cheesy_chicken_calories),
                context.getString(R.string.crock_pot_cheesy_chicken_fats), context.getString(R.string.crock_pot_cheesy_chicken_proteins),
                context.getString(R.string.crock_pot_cheesy_chicken_ingredients), context.getString(R.string.crock_pot_cheesy_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian6, context.getString(R.string.tandoori_salmon_title),
                context.getString(R.string.tandoori_salmon_time), context.getString(R.string.tandoori_salmon_calories),
                context.getString(R.string.tandoori_salmon_fats), context.getString(R.string.tandoori_salmon_proteins),
                context.getString(R.string.tandoori_salmon_ingredients), context.getString(R.string.tandoori_salmon_instruction)));

        dataList.add(new Data(R.drawable.italian7, context.getString(R.string.cashew_chicken_curry_title),
                context.getString(R.string.cashew_chicken_curry_time), context.getString(R.string.cashew_chicken_curry_calories),
                context.getString(R.string.cashew_chicken_curry_fats), context.getString(R.string.cashew_chicken_curry_proteins),
                context.getString(R.string.cashew_chicken_curry_ingredients), context.getString(R.string.cashew_chicken_curry_instruction)));

        dataList.add(new Data(R.drawable.italian8, context.getString(R.string.winnipeg_chicken_curry_title),
                context.getString(R.string.winnipeg_chicken_curry_time), context.getString(R.string.winnipeg_chicken_curry_calories),
                context.getString(R.string.winnipeg_chicken_curry_fats), context.getString(R.string.winnipeg_chicken_curry_proteins),
                context.getString(R.string.winnipeg_chicken_curry_ingredients), context.getString(R.string.winnipeg_chicken_curry_instruction)));

        dataList.add(new Data(R.drawable.italian9, context.getString(R.string.chili_chicken_title),
                context.getString(R.string.chili_chicken_time), context.getString(R.string.chili_chicken_calories),
                context.getString(R.string.chili_chicken_fats), context.getString(R.string.chili_chicken_proteins),
                context.getString(R.string.chili_chicken_ingredients), context.getString(R.string.chili_chicken_instruction)));

        dataList.add(new Data(R.drawable.italian10, context.getString(R.string.italian_salad_dressing_title),
                context.getString(R.string.italian_salad_dressing_time), context.getString(R.string.italian_salad_dressing_calories),
                context.getString(R.string.italian_salad_dressing_fats), context.getString(R.string.italian_salad_dressing_proteins),
                context.getString(R.string.italian_salad_dressing_ingredients), context.getString(R.string.italian_salad_dressing_instruction)));

        dataList.add(new Data(R.drawable.italian11, context.getString(R.string.award_winning_chili_title),
                context.getString(R.string.award_winning_chili_time), context.getString(R.string.award_winning_chili_calories),
                context.getString(R.string.award_winning_chili_fats), context.getString(R.string.award_winning_chili_proteins),
                context.getString(R.string.award_winning_chili_ingredients), context.getString(R.string.award_winning_chili_instruction)));

        dataList.add(new Data(R.drawable.italian12, context.getString(R.string.bourbon_chicken_title),
                context.getString(R.string.bourbon_chicken_time), context.getString(R.string.bourbon_chicken_calories),
                context.getString(R.string.bourbon_chicken_fats), context.getString(R.string.bourbon_chicken_proteins),
                context.getString(R.string.bourbon_chicken_ingredients), context.getString(R.string.bourbon_chicken_instruction)));


        // --->>> Arabian chicken recipe

        dataList.add(new Data(R.drawable.saudi1, context.getString(R.string.tempeh_chicken_salad_title),
                context.getString(R.string.tempeh_chicken_salad_time), context.getString(R.string.tempeh_chicken_salad_calories),
                context.getString(R.string.tempeh_chicken_salad_fats), context.getString(R.string.tempeh_chicken_salad_proteins),
                context.getString(R.string.tempeh_chicken_salad_ingredients), context.getString(R.string.tempeh_chicken_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi2, context.getString(R.string.white_bean_pumpkin_soup_title),
                context.getString(R.string.white_bean_pumpkin_soup_time), context.getString(R.string.white_bean_pumpkin_soup_calories),
                context.getString(R.string.white_bean_pumpkin_soup_fats), context.getString(R.string.white_bean_pumpkin_soup_proteins),
                context.getString(R.string.white_bean_pumpkin_soup_ingredients), context.getString(R.string.white_bean_pumpkin_soup_instruction)));

        dataList.add(new Data(R.drawable.saudi3, context.getString(R.string.heather_stir_fry_sauce_title),
                context.getString(R.string.heather_stir_fry_sauce_time), context.getString(R.string.heather_stir_fry_sauce_calories),
                context.getString(R.string.heather_stir_fry_sauce_fats), context.getString(R.string.heather_stir_fry_sauce_proteins),
                context.getString(R.string.heather_stir_fry_sauce_ingredients), context.getString(R.string.heather_stir_fry_sauce_instruction)));

        dataList.add(new Data(R.drawable.saudi4, context.getString(R.string.kale_chips_title),
                context.getString(R.string.kale_chips_time), context.getString(R.string.kale_chips_calories),
                context.getString(R.string.kale_chips_fats), context.getString(R.string.kale_chips_proteins),
                context.getString(R.string.kale_chips_ingredients), context.getString(R.string.kale_chips_instruction)));

        dataList.add(new Data(R.drawable.saudi5, context.getString(R.string.cucumber_tomato_salad_title),
                context.getString(R.string.cucumber_tomato_salad_time), context.getString(R.string.cucumber_tomato_salad_calories),
                context.getString(R.string.cucumber_tomato_salad_fats), context.getString(R.string.cucumber_tomato_salad_proteins),
                context.getString(R.string.cucumber_tomato_salad_ingredients), context.getString(R.string.cucumber_tomato_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi6, context.getString(R.string.garden_vegetable_soup_title),
                context.getString(R.string.garden_vegetable_soup_time), context.getString(R.string.garden_vegetable_soup_calories),
                context.getString(R.string.garden_vegetable_soup_fats), context.getString(R.string.garden_vegetable_soup_proteins),
                context.getString(R.string.garden_vegetable_soup_ingredients), context.getString(R.string.garden_vegetable_soup_instruction)));

        dataList.add(new Data(R.drawable.saudi7, context.getString(R.string.roasted_root_vegetable_title),
                context.getString(R.string.roasted_root_vegetable_time), context.getString(R.string.roasted_root_vegetable_calories),
                context.getString(R.string.roasted_root_vegetable_fats), context.getString(R.string.roasted_root_vegetable_proteins),
                context.getString(R.string.roasted_root_vegetable_ingredients), context.getString(R.string.roasted_root_vegetable_instruction)));

        dataList.add(new Data(R.drawable.saudi8, context.getString(R.string.roasted_green_beans_title),
                context.getString(R.string.roasted_green_beans_time), context.getString(R.string.roasted_green_beans_calories),
                context.getString(R.string.roasted_green_beans_fats), context.getString(R.string.roasted_green_beans_proteins),
                context.getString(R.string.roasted_green_beans_ingredients), context.getString(R.string.roasted_green_beans_instruction)));

        dataList.add(new Data(R.drawable.saudi9, context.getString(R.string.vegan_almond_biscotti_title),
                context.getString(R.string.vegan_almond_biscotti_time), context.getString(R.string.vegan_almond_biscotti_calories),
                context.getString(R.string.vegan_almond_biscotti_fats), context.getString(R.string.vegan_almond_biscotti_proteins),
                context.getString(R.string.vegan_almond_biscotti_ingredients), context.getString(R.string.vegan_almond_biscotti_instruction)));

        dataList.add(new Data(R.drawable.saudi10, context.getString(R.string.easy_vegan_pancakes_title),
                context.getString(R.string.easy_vegan_pancakes_time), context.getString(R.string.easy_vegan_pancakes_calories),
                context.getString(R.string.easy_vegan_pancakes_fats), context.getString(R.string.easy_vegan_pancakes_proteins),
                context.getString(R.string.easy_vegan_pancakes_ingredients), context.getString(R.string.easy_vegan_pancakes_instruction)));

        dataList.add(new Data(R.drawable.saudi11, context.getString(R.string.apple_salad_title),
                context.getString(R.string.apple_salad_time), context.getString(R.string.apple_salad_calories),
                context.getString(R.string.apple_salad_fats), context.getString(R.string.apple_salad_proteins),
                context.getString(R.string.apple_salad_ingredients), context.getString(R.string.apple_salad_instruction)));

        dataList.add(new Data(R.drawable.saudi12, context.getString(R.string.strawberry_salad_title),
                context.getString(R.string.strawberry_salad_time), context.getString(R.string.strawberry_salad_calories),
                context.getString(R.string.strawberry_salad_fats), context.getString(R.string.strawberry_salad_proteins),
                context.getString(R.string.strawberry_salad_ingredients), context.getString(R.string.strawberry_salad_instruction)));


        // --->>> Asian Chicken Recipes

        dataList.add(new Data(R.drawable.asian1, context.getString(R.string.asian_chicken_and_pasta_salad_title),
                context.getString(R.string.asian_chicken_and_pasta_salad_time), context.getString(R.string.asian_chicken_and_pasta_salad_calories),
                context.getString(R.string.asian_chicken_and_pasta_salad_fats), context.getString(R.string.asian_chicken_and_pasta_salad_proteins),
                context.getString(R.string.asian_chicken_and_pasta_salad_ingredients), context.getString(R.string.asian_chicken_and_pasta_salad_instruction)));

        dataList.add(new Data(R.drawable.asian2, context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_title),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_time), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_calories),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_fats), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_proteins),
                context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_ingredients), context.getString(R.string.greek_potatoes_oven_roasted_and_delicious_instruction)));

        dataList.add(new Data(R.drawable.asian3, context.getString(R.string.crock_pot_potato_chowder_title),
                context.getString(R.string.crock_pot_potato_chowder_time), context.getString(R.string.crock_pot_potato_chowder_calories),
                context.getString(R.string.crock_pot_potato_chowder_fats), context.getString(R.string.crock_pot_potato_chowder_proteins),
                context.getString(R.string.crock_pot_potato_chowder_ingredients), context.getString(R.string.crock_pot_potato_chowder_instructions)));

        dataList.add(new Data(R.drawable.asian4, context.getString(R.string.easy_baked_potato_wedges_title),
                context.getString(R.string.easy_baked_potato_wedges_time), context.getString(R.string.easy_baked_potato_wedges_calories),
                context.getString(R.string.easy_baked_potato_wedges_fats), context.getString(R.string.easy_baked_potato_wedges_proteins),
                context.getString(R.string.easy_baked_potato_wedges_ingredients), context.getString(R.string.easy_baked_potato_wedges_instruction)));

        dataList.add(new Data(R.drawable.asian5, context.getString(R.string.potato_soup_title),
                context.getString(R.string.potato_soup_time), context.getString(R.string.potato_soup_calories),
                context.getString(R.string.potato_soup_fats), context.getString(R.string.potato_soup_proteins),
                context.getString(R.string.potato_soup_ingredients), context.getString(R.string.potato_soup_instruction)));

        dataList.add(new Data(R.drawable.asian6, context.getString(R.string.slow_cooker_cheesy_chicken_penne_title),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_time), context.getString(R.string.slow_cooker_cheesy_chicken_penne_calories),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_fats), context.getString(R.string.slow_cooker_cheesy_chicken_penne_proteins),
                context.getString(R.string.slow_cooker_cheesy_chicken_penne_ingredients), context.getString(R.string.slow_cooker_cheesy_chicken_penne_instruction)));

        dataList.add(new Data(R.drawable.asian7, context.getString(R.string.crock_pot_chicken_taco_meat_title),
                context.getString(R.string.crock_pot_chicken_taco_meat_time), context.getString(R.string.crock_pot_chicken_taco_meat_calories),
                context.getString(R.string.crock_pot_chicken_taco_meat_fats), context.getString(R.string.crock_pot_chicken_taco_meat_proteins),
                context.getString(R.string.crock_pot_chicken_taco_meat_ingredients), context.getString(R.string.crock_pot_chicken_taco_meat_instruction)));

        dataList.add(new Data(R.drawable.asian8, context.getString(R.string.mahogany_beef_stew_title),
                context.getString(R.string.mahogany_beef_stew_time), context.getString(R.string.mahogany_beef_stew_calories),
                context.getString(R.string.mahogany_beef_stew_fats), context.getString(R.string.mahogany_beef_stew_proteins),
                context.getString(R.string.mahogany_beef_stew_ingredients), context.getString(R.string.mahogany_beef_stew_instruction)));

        dataList.add(new Data(R.drawable.asian9, context.getString(R.string.chili_con_carne_title),
                context.getString(R.string.chili_con_carne_time), context.getString(R.string.chili_con_carne_calories),
                context.getString(R.string.chili_con_carne_fats), context.getString(R.string.chili_con_carne_proteins),
                context.getString(R.string.chili_con_carne_ingredients), context.getString(R.string.chili_con_carne_instruction)));

        dataList.add(new Data(R.drawable.asian10, context.getString(R.string.german_potato_salad_title),
                context.getString(R.string.german_potato_salad_time), context.getString(R.string.german_potato_salad_calories),
                context.getString(R.string.german_potato_salad_fats), context.getString(R.string.german_potato_salad_proteins),
                context.getString(R.string.german_potato_salad_ingredients), context.getString(R.string.german_potato_salad_instruction)));

        dataList.add(new Data(R.drawable.asian8, context.getString(R.string.german_cucumber_salad_title),
                context.getString(R.string.german_cucumber_salad_time), context.getString(R.string.german_cucumber_salad_calories),
                context.getString(R.string.german_cucumber_salad_fats), context.getString(R.string.german_cucumber_salad_proteins),
                context.getString(R.string.german_cucumber_salad_ingredients), context.getString(R.string.german_cucumber_salad_instruction)));

        dataList.add(new Data(R.drawable.asian12, context.getString(R.string.german_tomato_salad_title),
                context.getString(R.string.german_tomato_salad_time), context.getString(R.string.german_tomato_salad_calories),
                context.getString(R.string.german_tomato_salad_fats), context.getString(R.string.german_tomato_salad_proteins),
                context.getString(R.string.german_tomato_salad_ingredients), context.getString(R.string.german_tomato_salad_instruction)));

        //  --->>>   chicken Kiev Recipes

        dataList.add(new Data(R.drawable.kiev1, context.getString(R.string.baked_chicken_kiev_title),
                context.getString(R.string.baked_chicken_kiev_time), context.getString(R.string.baked_chicken_kiev_calories),
                context.getString(R.string.baked_chicken_kiev_fats), context.getString(R.string.baked_chicken_kiev_proteins),
                context.getString(R.string.baked_chicken_kiev_ingredients), context.getString(R.string.baked_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev2, context.getString(R.string.authentic_chicken_parmesan_title),
                context.getString(R.string.authentic_chicken_parmesan_time), context.getString(R.string.authentic_chicken_parmesan_calories),
                context.getString(R.string.authentic_chicken_parmesan_fats), context.getString(R.string.authentic_chicken_parmesan_proteins),
                context.getString(R.string.authentic_chicken_parmesan_ingredients), context.getString(R.string.authentic_chicken_parmesan_instruction)));

        dataList.add(new Data(R.drawable.kiev3, context.getString(R.string.classic_chicken_kiev_title),
                context.getString(R.string.classic_chicken_kiev_time), context.getString(R.string.classic_chicken_kiev_calories),
                context.getString(R.string.classic_chicken_kiev_fats), context.getString(R.string.classic_chicken_kiev_proteins),
                context.getString(R.string.classic_chicken_kiev_ingredients), context.getString(R.string.classic_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev4, context.getString(R.string.garlic_hub_kiev_title),
                context.getString(R.string.garlic_hub_kiev_time), context.getString(R.string.garlic_hub_kiev_calories),
                context.getString(R.string.garlic_hub_kiev_fats), context.getString(R.string.garlic_hub_kiev_proteins),
                context.getString(R.string.garlic_hub_kiev_ingredients), context.getString(R.string.garlic_hub_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev5, context.getString(R.string.lemon_butter_kiev_title),
                context.getString(R.string.lemon_butter_kiev_time), context.getString(R.string.lemon_butter_kiev_calories),
                context.getString(R.string.lemon_butter_kiev_fats), context.getString(R.string.lemon_butter_kiev_proteins),
                context.getString(R.string.lemon_butter_kiev_ingredients), context.getString(R.string.lemon_butter_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev6, context.getString(R.string.teriyaki_chicken_kiev_title),
                context.getString(R.string.teriyaki_chicken_kiev_time), context.getString(R.string.teriyaki_chicken_kiev_calories),
                context.getString(R.string.teriyaki_chicken_kiev_fats), context.getString(R.string.teriyaki_chicken_kiev_proteins),
                context.getString(R.string.teriyaki_chicken_kiev_ingredients), context.getString(R.string.teriyaki_chicken_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev7, context.getString(R.string.mushroom_swiss_kiev_title),
                context.getString(R.string.mushroom_swiss_kiev_time), context.getString(R.string.mushroom_swiss_kiev_calories),
                context.getString(R.string.mushroom_swiss_kiev_fats), context.getString(R.string.mushroom_swiss_kiev_proteins),
                context.getString(R.string.mushroom_swiss_kiev_ingredients), context.getString(R.string.mushroom_swiss_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev8, context.getString(R.string.bacon_wrapped_kiev_title),
                context.getString(R.string.bacon_wrapped_kiev_time), context.getString(R.string.bacon_wrapped_kiev_calories),
                context.getString(R.string.bacon_wrapped_kiev_fats), context.getString(R.string.bacon_wrapped_kiev_proteins),
                context.getString(R.string.bacon_wrapped_kiev_ingredients), context.getString(R.string.bacon_wrapped_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev9, context.getString(R.string.dijon_mustard_kiev_title),
                context.getString(R.string.dijon_mustard_kiev_time), context.getString(R.string.dijon_mustard_kiev_calories),
                context.getString(R.string.dijon_mustard_kiev_fats), context.getString(R.string.dijon_mustard_kiev_proteins),
                context.getString(R.string.dijon_mustard_kiev_ingredients), context.getString(R.string.dijon_mustard_kiev_instruction)));

        dataList.add(new Data(R.drawable.kiev10, context.getString(R.string.spinach_feta_kiev),
                context.getString(R.string.spinach_feta_kiev_time), context.getString(R.string.spinach_feta_kiev_calories),
                context.getString(R.string.spinach_feta_kiev_fats), context.getString(R.string.spinach_feta_kiev_proteins),
                context.getString(R.string.spinach_feta_kiev_ingredients), context.getString(R.string.spinach_feta_kiev_instruction)));

        //  --->>>  sweet chicken recipe

        dataList.add(new Data(R.drawable.sweet1, context.getString(R.string.coconut_lime_chicken_title),
                context.getString(R.string.coconut_lime_chicken_time), context.getString(R.string.coconut_lime_chicken_calories),
                context.getString(R.string.coconut_lime_chicken_fats), context.getString(R.string.coconut_lime_chicken_proteins),
                context.getString(R.string.coconut_lime_chicken_ingredients), context.getString(R.string.coconut_lime_chicken_instruction)));


        dataList.add(new Data(R.drawable.sweet1, context.getString(R.string.coconut_lime_chicken_title),
                context.getString(R.string.honey_glazed_chicken_time), context.getString(R.string.honey_glazed_chicken_calories),
                context.getString(R.string.honey_glazed_chicken_fats), context.getString(R.string.honey_glazed_chicken_proteins),
                context.getString(R.string.honey_glazed_chicken_ingredients), context.getString(R.string.honey_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet2, context.getString(R.string.apricot_glazed_chicken_title),
                context.getString(R.string.apricot_glazed_chicken_time), context.getString(R.string.apricot_glazed_chicken_calories),
                context.getString(R.string.apricot_glazed_chicken_fats), context.getString(R.string.apricot_glazed_chicken_proteins),
                context.getString(R.string.apricot_glazed_chicken_ingredients), context.getString(R.string.apricot_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet3, context.getString(R.string.honey_chicken_thighs_title),
                context.getString(R.string.honey_chicken_thighs_time), context.getString(R.string.honey_chicken_thighs_calories),
                context.getString(R.string.honey_chicken_thighs_fats), context.getString(R.string.honey_chicken_thighs_proteins),
                context.getString(R.string.honey_chicken_thighs_ingredients), context.getString(R.string.honey_chicken_thighs_instruction)));

        dataList.add(new Data(R.drawable.sweet4, context.getString(R.string.orange_rosemary_chicken_title),
                context.getString(R.string.orange_rosemary_chicken_time), context.getString(R.string.orange_rosemary_chicken_calories),
                context.getString(R.string.orange_rosemary_chicken_fats), context.getString(R.string.orange_rosemary_chicken_proteins),
                context.getString(R.string.orange_rosemary_chicken_ingredients), context.getString(R.string.orange_rosemary_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet5, context.getString(R.string.honey_sriacha_chicken_leg_title),
                context.getString(R.string.honey_sriacha_chicken_leg_time), context.getString(R.string.honey_sriacha_chicken_leg_calories),
                context.getString(R.string.honey_sriacha_chicken_leg_fats), context.getString(R.string.honey_sriacha_chicken_leg_proteins),
                context.getString(R.string.honey_sriacha_chicken_leg_ingredients), context.getString(R.string.honey_sriacha_chicken_leg_instruction)));

        dataList.add(new Data(R.drawable.sweet6, context.getString(R.string.baked_honey_garlic_chicken_title),
                context.getString(R.string.baked_honey_garlic_chicken_time), context.getString(R.string.baked_honey_garlic_chicken_calories),
                context.getString(R.string.baked_honey_garlic_chicken_fats), context.getString(R.string.baked_honey_garlic_chicken_proteins),
                context.getString(R.string.baked_honey_garlic_chicken_ingredients), context.getString(R.string.baked_honey_garlic_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet7, context.getString(R.string.fig_glazed_chicken_title),
                context.getString(R.string.fig_glazed_chicken_time), context.getString(R.string.fig_glazed_chicken_calories),
                context.getString(R.string.fig_glazed_chicken_fats), context.getString(R.string.fig_glazed_chicken_proteins),
                context.getString(R.string.fig_glazed_chicken_ingredients), context.getString(R.string.fig_glazed_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet8, context.getString(R.string.honey_sesame_chicken_title),
                context.getString(R.string.honey_sesame_chicken_time), context.getString(R.string.honey_sesame_chicken_calories),
                context.getString(R.string.honey_sesame_chicken_fats), context.getString(R.string.honey_sesame_chicken_proteins),
                context.getString(R.string.honey_sesame_chicken_ingredients), context.getString(R.string.honey_sesame_chicken_instruction)));

        dataList.add(new Data(R.drawable.sweet9, context.getString(R.string.mango_chili_chicken_title),
                context.getString(R.string.mango_chili_chicken_time), context.getString(R.string.mango_chili_chicken_calories),
                context.getString(R.string.mango_chili_chicken_fats), context.getString(R.string.mango_chili_chicken_proteins),
                context.getString(R.string.mango_chili_chicken_ingredients), context.getString(R.string.mango_chili_chicken_instruction)));

        //  --->>>   salsa chicken Recipe

        dataList.add(new Data(R.drawable.salsa1, context.getString(R.string.creamy_salsa_chicken_title),
                context.getString(R.string.creamy_salsa_chicken_time), context.getString(R.string.creamy_salsa_chicken_calories),
                context.getString(R.string.creamy_salsa_chicken_fats), context.getString(R.string.creamy_salsa_chicken_proteins),
                context.getString(R.string.creamy_salsa_chicken_ingredients), context.getString(R.string.creamy_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa2, context.getString(R.string.mango_salsa_chicken_title),
                context.getString(R.string.mango_salsa_chicken_time), context.getString(R.string.mango_salsa_chicken_calories),
                context.getString(R.string.mango_salsa_chicken_fats), context.getString(R.string.mango_salsa_chicken_proteins),
                context.getString(R.string.mango_salsa_chicken_ingredients), context.getString(R.string.mango_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa3, context.getString(R.string.green_salsa_chicken_title),
                context.getString(R.string.green_salsa_chicken_time), context.getString(R.string.green_salsa_chicken_calories),
                context.getString(R.string.green_salsa_chicken_fats), context.getString(R.string.green_salsa_chicken_proteins),
                context.getString(R.string.green_salsa_chicken_ingredients), context.getString(R.string.green_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa4, context.getString(R.string.bake_salsa_chicken_title),
                context.getString(R.string.bake_salsa_chicken_time), context.getString(R.string.bake_salsa_chicken_calories),
                context.getString(R.string.bake_salsa_chicken_fats), context.getString(R.string.bake_salsa_chicken_proteins),
                context.getString(R.string.bake_salsa_chicken_ingredients), context.getString(R.string.bake_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa5, context.getString(R.string.verda_salsa_chicken_title),
                context.getString(R.string.verda_salsa_chicken_time), context.getString(R.string.verda_salsa_chicken_calories),
                context.getString(R.string.verda_salsa_chicken_fats), context.getString(R.string.verda_salsa_chicken_proteins),
                context.getString(R.string.verda_salsa_chicken_ingredients), context.getString(R.string.verda_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa6, context.getString(R.string.grilled_salsa_chicken_title),
                context.getString(R.string.grilled_salsa_chicken_time), context.getString(R.string.grilled_salsa_chicken_calories),
                context.getString(R.string.grilled_salsa_chicken_fats), context.getString(R.string.grilled_salsa_chicken_proteins),
                context.getString(R.string.grilled_salsa_chicken_ingredients), context.getString(R.string.grilled_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa7, context.getString(R.string.pineapple_salsa_chicken_title),
                context.getString(R.string.pineapple_salsa_chicken_time), context.getString(R.string.pineapple_salsa_chicken_calories),
                context.getString(R.string.pineapple_salsa_chicken_fats), context.getString(R.string.pineapple_salsa_chicken_proteins),
                context.getString(R.string.pineapple_salsa_chicken_ingredients), context.getString(R.string.pineapple_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa8, context.getString(R.string.mexican_salsa_chicken_title),
                context.getString(R.string.mexican_salsa_chicken_time), context.getString(R.string.mexican_salsa_chicken_calories),
                context.getString(R.string.mexican_salsa_chicken_fats), context.getString(R.string.mexican_salsa_chicken_proteins),
                context.getString(R.string.mexican_salsa_chicken_ingredients), context.getString(R.string.mexican_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa9, context.getString(R.string.bbq_salsa_chicken_title),
                context.getString(R.string.bbq_salsa_chicken_time), context.getString(R.string.bbq_salsa_chicken_calories),
                context.getString(R.string.bbq_salsa_chicken_fats), context.getString(R.string.bbq_salsa_chicken_proteins),
                context.getString(R.string.bbq_salsa_chicken_ingredients), context.getString(R.string.bbq_salsa_chicken_instruction)));

        dataList.add(new Data(R.drawable.salsa10, context.getString(R.string.buffalo_salsa_chicken_title),
                context.getString(R.string.buffalo_salsa_chicken_time), context.getString(R.string.buffalo_salsa_chicken_calories),
                context.getString(R.string.buffalo_salsa_chicken_fats), context.getString(R.string.buffalo_salsa_chicken_proteins),
                context.getString(R.string.buffalo_salsa_chicken_ingredients), context.getString(R.string.buffalo_salsa_chicken_instruction)));

        //  --->>>  spice chicken lover

        dataList.add(new Data(R.drawable.spicy1, context.getString(R.string.spicy_chicken_spicy_title),
                context.getString(R.string.spicy_chicken_spicy_time), context.getString(R.string.spicy_chicken_spicy_calories),
                context.getString(R.string.spicy_chicken_spicy_fats), context.getString(R.string.spicy_chicken_spicy_proteins),
                context.getString(R.string.spicy_chicken_spicy_ingredients), context.getString(R.string.spicy_chicken_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy2, context.getString(R.string.spicy_garlic_spicy_title),
                context.getString(R.string.spicy_garlic_spicy_time), context.getString(R.string.spicy_garlic_spicy_calories),
                context.getString(R.string.spicy_garlic_spicy_fats), context.getString(R.string.spicy_garlic_spicy_proteins),
                context.getString(R.string.spicy_garlic_spicy_ingredients), context.getString(R.string.spicy_garlic_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy3, context.getString(R.string.buffalo_spicy_title),
                context.getString(R.string.buffalo_spicy_time), context.getString(R.string.buffalo_spicy_calories),
                context.getString(R.string.buffalo_spicy_fats), context.getString(R.string.buffalo_spicy_proteins),
                context.getString(R.string.buffalo_spicy_ingredients), context.getString(R.string.buffalo_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy4, context.getString(R.string.orange_spicy_title),
                context.getString(R.string.orange_spicy_time), context.getString(R.string.orange_spicy_calories),
                context.getString(R.string.orange_spicy_fats), context.getString(R.string.orange_spicy_proteins),
                context.getString(R.string.orange_spicy_ingredients), context.getString(R.string.orange_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy5, context.getString(R.string.satay_spicy_title),
                context.getString(R.string.satay_spicy_time), context.getString(R.string.satay_spicy_calories),
                context.getString(R.string.satay_spicy_fats), context.getString(R.string.satay_spicy_proteins),
                context.getString(R.string.satay_spicy_ingredients), context.getString(R.string.satay_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy6, context.getString(R.string.firecracker_spicy_title),
                context.getString(R.string.firecracker_spicy_time), context.getString(R.string.firecracker_spicy_calories),
                context.getString(R.string.firecracker_spicy_fats), context.getString(R.string.firecracker_spicy_proteins),
                context.getString(R.string.firecracker_spicy_ingredients), context.getString(R.string.firecracker_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy7, context.getString(R.string.coconut_spicy_title),
                context.getString(R.string.coconut_spicy_time), context.getString(R.string.coconut_spicy_calories),
                context.getString(R.string.coconut_spicy_fats), context.getString(R.string.coconut_spicy_proteins),
                context.getString(R.string.coconut_spicy_ingredients), context.getString(R.string.coconut_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy8, context.getString(R.string.chili_spicy_title),
                context.getString(R.string.chili_spicy_time), context.getString(R.string.chili_spicy_calories),
                context.getString(R.string.chili_spicy_fats), context.getString(R.string.chili_spicy_proteins),
                context.getString(R.string.chili_spicy_ingredients), context.getString(R.string.chili_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy9, context.getString(R.string.harissa_spicy_title),
                context.getString(R.string.harissa_spicy_time), context.getString(R.string.harissa_spicy_calories),
                context.getString(R.string.harissa_spicy_fats), context.getString(R.string.harissa_spicy_proteins),
                context.getString(R.string.harissa_spicy_ingredients), context.getString(R.string.harissa_spicy_instruction)));

        dataList.add(new Data(R.drawable.spicy10, context.getString(R.string.peri_spicy_title),
                context.getString(R.string.peri_spicy_time), context.getString(R.string.peri_spicy_calories),
                context.getString(R.string.peri_spicy_fats), context.getString(R.string.peri_spicy_proteins),
                context.getString(R.string.peri_spicy_ingredients), context.getString(R.string.peri_spicy_instruction)));
        // --->>>  stuffed chicken Breasts

        dataList.add(new Data(R.drawable.stuffed1, context.getString(R.string.asparagus_breasts_title),
                context.getString(R.string.asparagus_breasts_time), context.getString(R.string.asparagus_breasts_calories),
                context.getString(R.string.asparagus_breasts_fats), context.getString(R.string.asparagus_breasts_proteins),
                context.getString(R.string.asparagus_breasts_ingredients), context.getString(R.string.asparagus_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed2, context.getString(R.string.caprese_breasts_title),
                context.getString(R.string.caprese_breasts_time), context.getString(R.string.caprese_breasts_calories),
                context.getString(R.string.caprese_breasts_fats), context.getString(R.string.caprese_breasts_proteins),
                context.getString(R.string.caprese_breasts_ingredients), context.getString(R.string.caprese_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed3, context.getString(R.string.spinach_breasts_title),
                context.getString(R.string.spinach_breasts_time), context.getString(R.string.spinach_breasts_calories),
                context.getString(R.string.spinach_breasts_fats), context.getString(R.string.spinach_breasts_proteins),
                context.getString(R.string.spinach_breasts_ingredients), context.getString(R.string.spinach_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed4, context.getString(R.string.cheddar_breasts_title),
                context.getString(R.string.cheddar_breasts_time), context.getString(R.string.cheddar_breasts_calories),
                context.getString(R.string.cheddar_breasts_fats), context.getString(R.string.cheddar_breasts_proteins),
                context.getString(R.string.cheddar_breasts_ingredients), context.getString(R.string.cheddar_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed5, context.getString(R.string.mushroom_breasts_title),
                context.getString(R.string.mushroom_breasts_time), context.getString(R.string.mushroom_breasts_calories),
                context.getString(R.string.mushroom_breasts_fats), context.getString(R.string.mushroom_breasts_proteins),
                context.getString(R.string.mushroom_breasts_ingredients), context.getString(R.string.mushroom_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed6, context.getString(R.string.cheese_breasts_title),
                context.getString(R.string.cheese_breasts_time), context.getString(R.string.cheese_breasts_calories),
                context.getString(R.string.cheese_breasts_fats), context.getString(R.string.cheese_breasts_proteins),
                context.getString(R.string.cheese_breasts_ingredients), context.getString(R.string.cheese_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed7, context.getString(R.string.mozzarella_breasts_title),
                context.getString(R.string.mozzarella_breasts_time), context.getString(R.string.mozzarella_breasts_calories),
                context.getString(R.string.mozzarella_breasts_fats), context.getString(R.string.mozzarella_breasts_proteins),
                context.getString(R.string.mozzarella_breasts_ingredients), context.getString(R.string.mozzarella_breasts_instruction)));

        dataList.add(new Data(R.drawable.stuffed8, context.getString(R.string.parmesan_breasts_title),
                context.getString(R.string.parmesan_breasts_time), context.getString(R.string.parmesan_breasts_calories),
                context.getString(R.string.parmesan_breasts_fats), context.getString(R.string.parmesan_breasts_proteins),
                context.getString(R.string.parmesan_breasts_ingredients), context.getString(R.string.parmesan_breasts_instruction)));

        return dataList;
    }

    public ArrayList<Data> getRecipeList(String listType){
        ArrayList<Data> dataList = new ArrayList<>();

        if (listType.equals("Asian Chicken Recipes")){
            dataList = getAsianRecipes();
        } else if (listType.equals("Arabian Chicken Recipes")){
            dataList = getArabianRecipes();
        } else if (listType.equals("Italian Chicken Recipes")){
            dataList = getItalianRecipes();
        } else if (listType.equals("Mexican Chicken Recipes")){
            dataList = getMexicanRecipes();
        } else if (listType.equals("Cheesy Chicken Recipes")){
            dataList = getCheesyChickenRecipes();
        } else if (listType.equals("Sweet Chicken Recipes")){
            dataList = getSweetChickenRecipes();
        } else if (listType.equals("Chicken Kiev Recipes")){
            dataList = getChickenKievRecipes();
        } else if (listType.equals("Salsa Chicken Recipes")){
            dataList = getSalsaChickenRecipes();
        } else if (listType.equals("Spice Lover Recipes")){
            dataList = getSpiceLoverRecipes();
        } else if (listType.equals("Stuffed Chicken Recipes")){
            dataList = getStuffedChickenRecipes();
        } else if (listType.equals("All Chicken Recipes")){
            dataList = getAllChickenRecipes();
        }

        return dataList;
    }

}
