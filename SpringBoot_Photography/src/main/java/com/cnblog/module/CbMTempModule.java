package com.cnblog.module;

public class CbMTempModule {
    private int rowId;

    private String info;

    private String notes;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CbMTempModule [rowId=" + rowId + ", info=" + info + ", notes=" + notes + "]";
    }

}
