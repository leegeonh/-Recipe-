package com.example.cknck.recipe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class FavoriteListAdapter extends BaseAdapter implements View.OnClickListener {

    private Context context;
    private List<Food> foodList;


    public FavoriteListAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.food, null);
        TextView foodName = (TextView) v.findViewById(R.id.foodName);
        ImageView foodImg = (ImageView) v.findViewById(R.id.foodImg);
        TextView ingredientLack = (TextView) v.findViewById(R.id.ingredientLack);

        foodName.setText(foodList.get(i).getFoodName());
        int lackNum = 0; //이거는 임시로 써놓은건데 다른데서 불충분한 재료의 개수 count해서 여기 lackNum에다가 저장해줘야 될거같아요
        ingredientLack.setText(Integer.toString(lackNum) + "개의 재료만 더 있으면 만들 수 있습니다.");
        foodImg.setImageResource(foodList.get(i).getImage());

        v.setTag(foodList.get(i).getFoodName());

        Button btnLike = (Button) v.findViewById(R.id.btnLike);
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodList.get(i).setFavorite(false);
                foodList.remove(i);
                notifyDataSetChanged();
            }
        });


        return v;
    }


    @Override
    public void onClick(View v) {

    }
}