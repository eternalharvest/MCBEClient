package jp.dip.hmy2001.mcbeClient.network.mcbe.protocol;

import jp.dip.hmy2001.mcbeClient.network.mcbe.GamePacket;

public class MovePlayerPacket extends GamePacket {

    public int entityRuntimeId;
    public float playerX;
    public float playerY;
    public float playerZ;

    public byte getPacketId() {
        return ProtocolInfo.MOVE_PLAYER_PACKET;
    }

    public void encodeBody(){
        writeVarLong(entityRuntimeId);
        writeFloatLE(playerX);
        writeFloatLE(playerY);
        writeFloatLE(playerZ);
        writeFloatLE(0);
        writeFloatLE(0);
        writeFloatLE(0);
        writeByte(0);
        writeBoolean(true);
        writeVarLong(0);
        //TODO
    }

    public void decodeBody(){

    }

}
