package sample.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public Shake(Node node){
        tt = new TranslateTransition(Duration.millis(50),node);
        tt.setFromX(00);
        tt.setByX(6f);
        tt.setCycleCount(6);
        tt.setAutoReverse(true);
    }
public void playAnim(){
        tt.playFromStart();
}

}
