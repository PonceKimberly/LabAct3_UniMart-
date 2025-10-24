package com.example.unimart;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MarketplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);

        TextView welcomeText = findViewById(R.id.welcomeText);
        welcomeText.setText("Welcome to UniMart Marketplace!\n\n" +
                "🎓 Your Student Marketplace\n\n" +
                "Available Features:\n" +
                "• Buy & Sell Items\n" +
                "• Student Community\n" +
                "• Sustainable Marketplace\n" +
                "• Textbook Exchange\n" +
                "• Campus Services\n\n" +
                "Supporting SDG 4: Quality Education\n" +
                "Supporting SDG 12: Responsible Consumption");
    }
}