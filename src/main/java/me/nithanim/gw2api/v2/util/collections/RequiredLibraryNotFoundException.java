package me.nithanim.gw2api.v2.util.collections;

public class RequiredLibraryNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public RequiredLibraryNotFoundException(String message) {
        super(message);
    }
}
