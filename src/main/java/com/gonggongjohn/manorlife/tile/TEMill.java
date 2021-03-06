package com.gonggongjohn.manorlife.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TEMill extends TileEntity implements ITickable {
    public float prevRotationAngle = 0;
    public float rotationAngle = 0;
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        return super.writeToNBT(compound);
    }

    @Override
    public void update() {
        this.prevRotationAngle = this.rotationAngle;
        if(this.rotationAngle >= 1.0F) this.rotationAngle = 0.0F;
        else this.rotationAngle += 0.1F;
    }
}
