package cn.ksmcbrigade.sc.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(method = "render",at = @At("TAIL"))
    public void render(GuiGraphics p_282860_, int p_281753_, int p_283539_, float p_282628_, CallbackInfo ci){
        p_282860_.drawString(Minecraft.getInstance().font,"Welcome to use SimpleClient!",2,2, Color.BLUE.getRGB(),true);
    }
}
