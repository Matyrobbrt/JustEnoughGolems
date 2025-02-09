package com.zkryle.jeg.client.golem.renderers;

import com.zkryle.jeg.JustEnoughGolems;
import com.zkryle.jeg.client.golem.models.MagmaticGolemEntityModel;
import com.zkryle.jeg.client.golem.models.PlantGolemEntityModel;
import com.zkryle.jeg.common.golem.MagmaticGolemEntity;
import com.zkryle.jeg.common.golem.PlantGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.util.ResourceLocation;

public class MagmaticGolemEntityRenderer extends MobRenderer <MagmaticGolemEntity, MagmaticGolemEntityModel <MagmaticGolemEntity>>{

    public static final ResourceLocation TEXTURE = new ResourceLocation( JustEnoughGolems.MOD_ID , "textures/entity/magmaticgolem/magmaticgolem.png" );

    public MagmaticGolemEntityRenderer( EntityRendererManager manager ){
        super( manager , new MagmaticGolemEntityModel <>() , 0.4f );
    }

    @Override
    public ResourceLocation getTextureLocation( MagmaticGolemEntity pEntity ){
        return TEXTURE;
    }
}
