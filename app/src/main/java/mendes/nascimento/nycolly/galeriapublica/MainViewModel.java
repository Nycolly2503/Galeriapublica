package mendes.nascimento.nycolly.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    private static final android.app.Application Application = ;
    int navigationOpSelected = R.id.gridViewOp;
    public MainViewModel(@NonNull Application){
        super(Application);}
    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }
    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }
}
