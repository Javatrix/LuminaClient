package me.stormcph.lumina.module.impl.combat;


// TODO: 15/05/2023 (Qweru) maybe in the future im lazy



//import me.stormcph.lumina.event.EventTarget;
//import me.stormcph.lumina.event.impl.EventUpdate;
//import me.stormcph.lumina.module.Category;
//import me.stormcph.lumina.module.Module;
//import me.stormcph.lumina.setting.impl.BooleanSetting;
//import me.stormcph.lumina.setting.impl.ModeSetting;
//import me.stormcph.lumina.setting.impl.NumberSetting;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.decoration.EndCrystalEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.util.math.Vec3d;
//
//public class TriggerBot extends Module {
//
//    ModeSetting targets = new ModeSetting("Target", "Players", "Players", "Hostiles", "All");
//    NumberSetting cooldownMS = new NumberSetting("Cooldown-ms", 0, 5000, 300, 10);
//
//
//    public TriggerBot() {
//         super("TriggerBot", "Automatically hits entities if looked at", Category.COMBAT);
//         addSettings(targets);
//    }
//
//    @EventTarget
//    public void onEventUpdate(EventUpdate e){
//
//    }
//
//    private Entity raycastEntity(double range) {
//        Vec3d cameraPos = mc.gameRenderer.getCamera().getPos();
//        Vec3d viewVector = mc.player.getRotationVecClient();
//        Vec3d extendedPoint = cameraPos.add(viewVector.x * range, viewVector.y * range, viewVector.z * range);
//
//        for (Entity entity : mc.world.getEntities()) {
//            if (entity instanceof PlayerEntity && targets.getMode().equals("Players")) {
//                if (entity.getBoundingBox().expand(0.3).intersects(cameraPos, extendedPoint)) {
//                    return entity;
//                }
//            } else if(targets.getMode().equals("Hostiles")){
//
//            }
//        }
//
//        return null;
//    }
//}