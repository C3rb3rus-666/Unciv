package com.unciv.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.unciv.game.utils.CameraStageBaseScreen;

import javax.xml.soap.Text;

public class VictoryScreen extends CameraStageBaseScreen{

    public VictoryScreen(final UnCivGame game) {
        super(game);

        Label label = new Label("Congrendulation!\r\nYou have won!!!!!",skin);
        label.setFontScale(5);
        label.setPosition((stage.getWidth()-label.getWidth())/2 , (stage.getHeight()-label.getHeight())/2 );
        stage.addActor(label);


        TextButton newGameButton = new TextButton("New game!",skin);
        newGameButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.startNewGame();
            }
        });
        newGameButton.setPosition((stage.getWidth()-newGameButton.getWidth())/2 , 10);
    }


}
