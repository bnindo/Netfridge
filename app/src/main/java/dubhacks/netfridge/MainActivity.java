package dubhacks.netfridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openInventory(View view){
        Intent intent = new Intent(this, InventoryViewActivity.class);
        startActivity(intent);
    }

    public void findRecipe(View view) {
        Intent intent = new Intent(this, RecipeSearchActivity.class);
        startActivity(intent);
    }

    public void openCamera(View view) {
        
    }
}
