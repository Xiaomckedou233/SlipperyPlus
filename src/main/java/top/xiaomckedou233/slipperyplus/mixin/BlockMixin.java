package top.xiaomckedou233.slipperyplus.mixin;

import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public abstract class BlockMixin {
    @Inject(method = "getSlipperiness", at = @At("HEAD"), cancellable = true)
    private void injectSlipperiness(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.989F);
    }

    @Inject(method = "getVelocityMultiplier", at = @At("HEAD"), cancellable = true)
    private void injectVelocityMultiplier(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.1F);
    }
}
