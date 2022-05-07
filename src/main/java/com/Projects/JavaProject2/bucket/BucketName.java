package com.Projects.JavaProject2.bucket;

public enum BucketName {

    PROFILE_IMAGE("aaron-file-upload");

    private final String bucketName;


    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
