package net.dongliu.apk.parser.struct.resource;

import net.dongliu.apk.parser.struct.ChunkHeader;
import net.dongliu.apk.parser.struct.ChunkType;

public class StagedAliasHeader extends ChunkHeader {
    private int count;

    public StagedAliasHeader(int headerSize, long chunkSize) {
        super(ChunkType.OVERLAYABLE_TYPE, headerSize, chunkSize);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
