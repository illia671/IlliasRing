// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmrfire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mrfire"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart RightArm;
	private final ModelPart shoulder;
	private final ModelPart LeftArm;
	private final ModelPart shoulder2;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmrfire(ModelPart root) {
		this.Head = root.getChild("Head");
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(62, 37)
						.addBox(0.0F, 0.0F, -2.2F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2",
				CubeListBuilder.create().texOffs(46, 46)
						.addBox(-0.5F, 2.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).texOffs(46, 46)
						.addBox(-0.5F, 1.9F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.425F)).texOffs(52, 43)
						.addBox(-0.55F, 2.13F, -2.55F, 1.1F, 1.17F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 40)
						.addBox(-1.4F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -2.3692F, -1.4492F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.6125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.6125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2875F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2875F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.1125F, 0.05F, 0.95F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r7 = Body2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.1125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r8 = Body2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(40, 40)
						.addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5508F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.5691F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6243F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6426F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.6059F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5125F, 0.05F, 0.95F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r9 = Body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 40)
				.addBox(-1.6059F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.6426F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.6242F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.5691F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.5507F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.addBox(-1.5324F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
				.mirror().addBox(2.1809F, -1.8596F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror().addBox(2.2176F, -2.6789F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
				.mirror(false).texOffs(40, 40).mirror()
				.addBox(2.1993F, -2.2692F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror().addBox(2.1441F, -1.0404F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
				.mirror(false).texOffs(40, 40).mirror()
				.addBox(2.1625F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror().addBox(2.1258F, -0.6308F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
				.mirror(false).texOffs(40, 40).mirror()
				.addBox(2.1074F, -0.2211F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(40, 40)
						.addBox(-1.4F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -2.3692F, -1.4493F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).texOffs(40, 40)
						.addBox(-1.4F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r11 = Body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 40).mirror()
				.addBox(-1.6F, -2.7789F, -1.4676F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror()
				.addBox(-1.6F, -2.3692F, -1.4493F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror()
				.addBox(-1.6F, -1.1404F, -1.3941F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror().addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F))
				.mirror(false).texOffs(40, 40).mirror()
				.addBox(-1.6F, -0.7308F, -1.3758F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror()
				.addBox(-1.6F, -0.3211F, -1.3574F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false)
				.texOffs(40, 40).mirror()
				.addBox(-1.6F, -1.9596F, -1.4309F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.7875F, 0.05F, -0.65F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r12 = Body2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.0625F, 0.85F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r13 = Body2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.5625F, 0.2F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5F, -1.4F, -1.45F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.8206F, -0.016F, -1.875F, -0.5672F, 0.0F, -0.6109F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.5F, -1.4F, -1.45F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.8206F, -0.016F, -1.875F, -0.5672F, 0.0F, 0.6109F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.5625F, 0.2F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.3125F, 0.525F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.3125F, 0.525F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.5625F, 1.5F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.5625F, 1.5F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.8125F, 1.175F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.8125F, 1.175F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.3125F, 1.825F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.3125F, 1.825F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0625F, 2.15F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0625F, 2.15F, -1.975F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(1.0625F, 0.85F, -1.975F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.0625F, 0.85F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.0625F, 0.85F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.5625F, 0.2F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.5625F, 0.2F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.3125F, 0.525F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-1.3125F, 0.525F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5625F, 1.5F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.5625F, 1.5F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.8125F, 1.175F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.8125F, 1.175F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.3125F, 1.825F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.3125F, 1.825F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.0625F, 2.15F, -1.975F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-0.0625F, 2.15F, -1.975F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, 1.7F, -2.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(52, 43).addBox(-0.355F, -1.07F, -0.45F, 1.1F, 1.17F, 1.0F,
						new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.6F, 1.2F, -0.1F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, 1.7F, -2.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(52, 43).addBox(-0.355F, -1.07F, -0.45F, 1.1F, 1.17F, 1.0F,
						new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.6F, 1.2F, -0.1F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.1875F, 0.125F, 0.025F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r51 = bone2.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.4375F, 0.45F, 0.025F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.8F, 1.35F, -2.08F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(52, 43).addBox(0.43F, -1.19F, -0.45F, 1.1F, 1.17F, 1.0F,
						new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(-0.1F, 1.55F, -0.02F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.4F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2375F, 0.15F, 0.105F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.5875F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(0.2375F, 0.15F, 0.105F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.8F, 1.35F, -2.08F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(52, 43).addBox(0.02F, -0.9F, -0.45F, 1.1F, 1.17F, 1.0F,
						new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.3F, 0.55F, -0.02F, 0.0F, 0.0F, -2.5307F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.6F, -1.55F, -1.4125F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.2375F, 0.15F, 0.105F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(40, 40).mirror()
						.addBox(-1.4125F, -1.45F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.2375F, 0.15F, 0.105F, 0.0F, 0.0F, 0.6109F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 16)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r58 = RightArm.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(41, 19).mirror()
						.addBox(-2.4F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, 4.0F, 0.0F, -0.0052F, -0.0138F, -1.7439F));

		PartDefinition shoulder = RightArm.addOrReplaceChild("shoulder", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r59 = shoulder
				.addOrReplaceChild("cube_r59",
						CubeListBuilder.create().texOffs(41, 19).addBox(-3.6F, -0.5F, -2.1F, 6.0F, 2.0F, 4.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r60 = shoulder
				.addOrReplaceChild("cube_r60",
						CubeListBuilder.create().texOffs(41, 19).addBox(-3.6F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(24, 16).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r61 = LeftArm.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(41, 19).mirror()
						.addBox(-2.4F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, 4.0F, 0.0F, -3.1416F, 0.0F, -1.3963F));

		PartDefinition shoulder2 = LeftArm.addOrReplaceChild("shoulder2", CubeListBuilder.create(),
				PartPose.offset(1.5F, -2.0F, 0.0F));

		PartDefinition cube_r62 = shoulder2.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(41, 19).mirror()
						.addBox(-2.4F, -0.5F, -2.1F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r63 = shoulder2.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(41, 19).mirror()
						.addBox(-2.4F, -0.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(32, 0).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}