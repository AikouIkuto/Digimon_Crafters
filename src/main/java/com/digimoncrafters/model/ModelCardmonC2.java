package com.digimoncrafters.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCardmonC2 extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Head3;
    ModelRenderer Head4;
    ModelRenderer Head5;
    ModelRenderer Head6;
    ModelRenderer Card;
  
  public ModelCardmonC2()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 31, 1);
      Head.addBox(-4F, -4F, -8F, 8, 8, 8);
      Head.setRotationPoint(0F, 9F, -3F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Head1 = new ModelRenderer(this, 19, 42);
      Head1.addBox(-4F, -2F, -4F, 7, 1, 7);
      Head1.setRotationPoint(0.5F, 6F, -6.5F);
      Head1.setTextureSize(64, 64);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      Head2 = new ModelRenderer(this, 19, 31);
      Head2.addBox(-4F, -3F, 0F, 7, 7, 1);
      Head2.setRotationPoint(0.5F, 8.5F, -12F);
      Head2.setTextureSize(64, 64);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, 0F);
      Head3 = new ModelRenderer(this, 0, 49);
      Head3.addBox(0F, -3F, -3F, 1, 7, 7);
      Head3.setRotationPoint(4F, 8.5F, -7.5F);
      Head3.setTextureSize(64, 64);
      Head3.mirror = true;
      setRotation(Head3, 0F, 0F, 0F);
      Head4 = new ModelRenderer(this, 0, 31);
      Head4.addBox(-2F, -3F, -3F, 1, 7, 7);
      Head4.setRotationPoint(-3F, 8.5F, -7.5F);
      Head4.setTextureSize(64, 64);
      Head4.mirror = true;
      setRotation(Head4, 0F, 0F, 0F);
      Head5 = new ModelRenderer(this, 19, 53);
      Head5.addBox(-4F, 0F, -4F, 7, 1, 7);
      Head5.setRotationPoint(0.5F, 13F, -6.5F);
      Head5.setTextureSize(64, 64);
      Head5.mirror = true;
      setRotation(Head5, 0F, 0F, 0F);
      Head6 = new ModelRenderer(this, 38, 24);
      Head6.addBox(-3F, -3F, 0F, 7, 7, 1);
      Head6.setRotationPoint(-0.5F, 8.5F, -3F);
      Head6.setTextureSize(64, 64);
      Head6.mirror = true;
      setRotation(Head6, 0F, 0F, 0F);
      Card = new ModelRenderer(this, 0, 0);
      Card.addBox(0F, -6F, 0F, 0, 12, 18);
      Card.setRotationPoint(0F, 9F, -1F);
      Card.setTextureSize(64, 64);
      Card.mirror = true;
      setRotation(Card, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    float scaleFactor = 0.4F; // determines the scale of the entity. Mess with this to find the right size.
    GL11.glPushMatrix();
    GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
    GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Head1.render(f5);
    Head2.render(f5);
    Head3.render(f5);
    Head4.render(f5);
    Head5.render(f5);
    Head6.render(f5);
    Card.render(f5);
    
    GL11.glPopMatrix(); // Don't forget to pop the matrix afterwards.
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
