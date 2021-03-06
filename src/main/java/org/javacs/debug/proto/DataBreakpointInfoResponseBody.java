package org.javacs.debug.proto;

public class DataBreakpointInfoResponseBody {
    /**
     * An identifier for the data on which a data breakpoint can be registered with the setDataBreakpoints request or
     * null if no data breakpoint is available.
     */
    public String dataId;
    /** UI string that describes on what data the breakpoint is set on or why a data breakpoint is not available. */
    public String description;
    /**
     * Optional attribute listing the available access types for a potential data breakpoint. A UI frontend could
     * surface this information. 'read' | 'write' | 'readWrite'.
     */
    public String[] accessTypes;
    /** Optional attribute indicating that a potential data breakpoint could be persisted across sessions. */
    public Boolean canPersist;
}
