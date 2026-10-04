package net.mcreator.illiasaddon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelphoenixguard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("illiasringaddon", "modelphoenixguard"), "main");
	public final ModelPart Head;
	public final ModelPart hood;
	public final ModelPart Body;
	public final ModelPart Body2;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart RightArm;
	public final ModelPart shoulder;
	public final ModelPart LeftArm;
	public final ModelPart shoulder2;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelphoenixguard(ModelPart root) {
		this.Head = root.getChild("Head");
		this.hood = this.Head.getChild("hood");
		this.Body = root.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.bone4 = this.Body2.getChild("bone4");
		this.RightArm = root.getChild("RightArm");
		this.shoulder = this.RightArm.getChild("shoulder");
		this.LeftArm = root.getChild("LeftArm");
		this.shoulder2 = this.LeftArm.getChild("shoulder2");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 16).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition hood = Head.addOrReplaceChild("hood", CubeListBuilder.create(), PartPose.offset(0.0F, -3.974F, 0.4263F));
		PartDefinition cube_r2 = hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 94).addBox(4.2409F, -3.5F, 0.3989F, 1.0F, 7.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 1.5708F));
		PartDefinition cube_r3 = hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(82, 103).addBox(1.2409F, -3.5F, 2.9989F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.0F, -0.0436F, 1.5708F));
		PartDefinition cube_r4 = hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 111).addBox(-0.7573F, -4.1714F, 3.0739F, 5.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(108, 96).mirror()
				.addBox(3.9677F, -3.8714F, -5.1261F, 1.0F, 8.0F, 9.0F, new CubeDeformation(-0.075F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.043F, 0.0076F, -0.1744F));
		PartDefinition cube_r5 = hood.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(94, 104).addBox(-4.2427F, -4.1714F, 3.0489F, 5.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(21, 111).addBox(-4.9677F, -3.8714F, -5.1261F, 1.0F, 8.0F, 9.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.043F, -0.0076F, 0.1744F));
		PartDefinition cube_r6 = hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(5.1226F, -2.0234F, -5.1261F, 1.0F, 3.0F, 9.0F, new CubeDeformation(-0.075F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.0295F, -0.0322F, 0.8286F));
		PartDefinition cube_r7 = hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 115).mirror().addBox(-5.1669F, -3.5996F, -5.1311F, 1.0F, 4.0F, 9.0F, new CubeDeformation(-0.075F)).mirror(false).texOffs(124, 117)
				.addBox(-4.5419F, -3.1996F, 2.8989F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, -0.0057F, -0.0433F, 1.7018F));
		PartDefinition cube_r8 = hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 115).addBox(4.1669F, -3.5996F, -5.1311F, 1.0F, 4.0F, 9.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, -0.0057F, 0.0433F, -1.7018F));
		PartDefinition cube_r9 = hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 118).addBox(-0.492F, -5.2409F, -5.1261F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r10 = hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(108, 116).addBox(-6.1226F, -2.0234F, -5.1261F, 1.0F, 3.0F, 9.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, -0.0087F, 0.1998F, 0.0295F, 0.0322F, -0.8286F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(71, 20).addBox(-4.5F, 11.0F, -2.5F, 9.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(46, 46).addBox(-0.5F, 2.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).texOffs(46, 46)
				.addBox(-0.5F, 1.9F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.425F)).texOffs(52, 43).addBox(-0.55F, 2.13F, -2.55F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Body2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -2.3692F, -1.4492F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r12 = Body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.6125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r13 = Body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.6125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2875F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2875F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.1125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.1125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.5508F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.5691F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6243F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.6426F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6059F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.6059F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.6426F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6242F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.5691F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.5507F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).mirror().addBox(2.1809F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror()
						.addBox(2.2176F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror().addBox(2.1993F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
						.texOffs(40, 40).mirror().addBox(2.1441F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror().addBox(2.1625F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
						.mirror(false).texOffs(40, 40).mirror().addBox(2.1258F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror()
						.addBox(2.1074F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -2.3692F, -1.4493F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, -1.5708F));
		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror()
						.addBox(-1.6F, -2.3692F, -1.4493F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror().addBox(-1.6F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
						.texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror().addBox(-1.6F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
						.mirror(false).texOffs(40, 40).mirror().addBox(-1.6F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false).texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.0625F, 0.85F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.5625F, 0.2F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5F, -1.4F, -1.45F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.8206F, -0.016F, -1.875F, -0.5672F, 0.0F, -0.6109F));
		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.5F, -1.4F, -1.45F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.8206F, -0.016F, -1.875F, -0.5672F, 0.0F, 0.6109F));
		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.5625F, 0.2F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.3125F, 0.525F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.3125F, 0.525F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.5625F, 1.5F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.5625F, 1.5F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.8125F, 1.175F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.8125F, 1.175F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.3125F, 1.825F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.3125F, 1.825F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0625F, 2.15F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0625F, 2.15F, -1.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.0625F, 0.85F, -1.975F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.0625F, 0.85F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.0625F, 0.85F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.5625F, 0.2F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.5625F, 0.2F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.3125F, 0.525F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.3125F, 0.525F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5625F, 1.5F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5625F, 1.5F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.8125F, 1.175F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.8125F, 1.175F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.3125F, 1.825F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.3125F, 1.825F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.0625F, 2.15F, -1.975F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.0625F, 2.15F, -1.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.7F, -2.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 43).addBox(-0.355F, -1.07F, -0.45F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.6F, 1.2F, -0.1F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.7F, -2.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r57 = bone2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 43).addBox(-0.355F, -1.07F, -0.45F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.6F, 1.2F, -0.1F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r58 = bone2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r59 = bone2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.35F, -2.08F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 43).addBox(0.43F, -1.19F, -0.45F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(-0.1F, 1.55F, -0.02F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2375F, 0.15F, 0.105F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2375F, 0.15F, 0.105F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.35F, -2.08F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 43).addBox(0.02F, -0.9F, -0.45F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.3F, 0.55F, -0.02F, 0.0F, 0.0F, -2.5307F));
		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.2375F, 0.15F, 0.105F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.2375F, 0.15F, 0.105F, 0.0F, 0.0F, 0.6109F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition shoulder = RightArm.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.0F, 0.0F));
		PartDefinition cube_r68 = shoulder.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 75).addBox(-3.6F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition shoulder2 = LeftArm.addOrReplaceChild("shoulder2", CubeListBuilder.create(), PartPose.offset(1.5F, -2.0F, 0.0F));
		PartDefinition cube_r69 = shoulder2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-2.4F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 32).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
