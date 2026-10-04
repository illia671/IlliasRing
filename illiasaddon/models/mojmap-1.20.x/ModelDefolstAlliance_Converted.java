// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDefolstAlliance_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "defolstalliance_converted"), "main");
	private final ModelPart group;

	public ModelDefolstAlliance_Converted(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(16, 1)
						.addBox(0.05F, -0.6F, -0.5F, 0.45F, 0.1F, 0.5F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(0.5F, -0.6F, -0.45F, 0.05F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(0.0F, -0.6F, -0.45F, 0.05F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(3, 51)
						.addBox(0.03F, -0.5F, -0.53F, 0.5F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(19, 48)
						.addBox(0.03F, -0.5F, -0.08F, 0.5F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(25, 23)
						.addBox(0.03F, -0.1F, -0.5F, 0.5F, 0.05F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 11.5F, -0.5F, -1.5708F, 1.5272F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}