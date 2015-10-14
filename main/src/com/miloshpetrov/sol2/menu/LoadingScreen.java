package com.miloshpetrov.sol2.menu;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.miloshpetrov.sol2.SolApplication;
import com.miloshpetrov.sol2.TextureManager;
import com.miloshpetrov.sol2.common.SolColor;
import com.miloshpetrov.sol2.files.FileManager;
import com.miloshpetrov.sol2.game.DebugOptions;
import com.miloshpetrov.sol2.ui.*;

import java.util.ArrayList;
import java.util.List;

public class LoadingScreen implements SolUiScreen {
  private final ArrayList<SolUiControl> myControls;
  private boolean myTut;
  private boolean myUsePrevShip;

  public LoadingScreen(TextureManager textureManager) {
    myControls = new ArrayList<SolUiControl>();
  }

  @Override
  public List<SolUiControl> getControls() {
    return myControls;
  }

  @Override
  public void onAdd(SolApplication cmp) {
  }

  @Override
  public void updateCustom(SolApplication cmp, SolInputManager.Ptr[] ptrs, boolean clickedOutside) {
    cmp.startNewGame(myTut, myUsePrevShip);
  }

  @Override
  public boolean isCursorOnBg(SolInputManager.Ptr ptr) {
    return false;
  }

  @Override
  public void blurCustom(SolApplication cmp) {
  }

  @Override
  public void drawBg(UiDrawer uiDrawer, SolApplication cmp) {
    uiDrawer.draw(uiDrawer.filler, SolColor.Background_Grey);

  }

  @Override
  public void drawImgs(UiDrawer uiDrawer, SolApplication cmp) {
  }

  @Override
  public void drawText(UiDrawer uiDrawer, SolApplication cmp) {
    uiDrawer.drawString("Loading...", uiDrawer.r/2, .5f, FontSize.MENU, true, SolColor.W);
  }

  @Override
  public boolean reactsToClickOutside() {
    return false;
  }

  public void setMode(boolean tut, boolean usePrevShip) {
    myTut = tut;
    myUsePrevShip = usePrevShip;
  }
}
