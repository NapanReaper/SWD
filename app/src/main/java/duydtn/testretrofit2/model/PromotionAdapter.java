package duydtn.testretrofit2.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import duydtn.testretrofit2.R;

public class PromotionAdapter extends RecyclerView.Adapter<PromotionAdapter.PromotionViewHolder> {
    private Context mCtx;

    //we are storing all the products in a list
    private List<PromotionsDatum> promotionList;

    //getting the context and product list with constructor


    public PromotionAdapter(Context mCtx, List<PromotionsDatum> promotionList) {
        this.mCtx = mCtx;
        this.promotionList = promotionList;
    }

    class PromotionViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtDescription, txtBrandCode, txtBegin, txtEnd;
        ImageView imageView;

        public PromotionViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtBrandCode = itemView.findViewById(R.id.txtBrandCode);
            imageView = itemView.findViewById(R.id.imageView);
            txtBegin = itemView.findViewById(R.id.txtBeginTime);
            txtEnd = itemView.findViewById(R.id.txtEndTime);
        }
    }

    @Override
    public PromotionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_promotions, null);
        return new PromotionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromotionViewHolder holder, int position) {
        PromotionsDatum promotion = promotionList.get(position);

        //binding the data with the viewholder views
        holder.txtName.setText(promotion.getName());
        holder.txtDescription.setText(promotion.getImageUrl());
        holder.txtBrandCode.setText(String.valueOf(promotion.getBrandCode()));
        holder.txtBegin.setText(String.valueOf(promotion.getBeginTime()));
        holder.txtEnd.setText(String.valueOf(promotion.getEndTime()));
        Glide.with(mCtx).load(promotion.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return promotionList.size();
    }


}
