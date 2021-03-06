<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/source/v1/source_context.proto

namespace Google\Cloud\DevTools\Source\V1;

/**
 * The type of an Alias.
 *
 * Protobuf enum <code>Google\Devtools\Source\V1\AliasContext\Kind</code>
 */
class AliasContext_Kind
{
    /**
     * Do not use.
     *
     * Generated from protobuf enum <code>ANY = 0;</code>
     */
    const ANY = 0;
    /**
     * Git tag
     *
     * Generated from protobuf enum <code>FIXED = 1;</code>
     */
    const FIXED = 1;
    /**
     * Git branch
     *
     * Generated from protobuf enum <code>MOVABLE = 2;</code>
     */
    const MOVABLE = 2;
    /**
     * OTHER is used to specify non-standard aliases, those not of the kinds
     * above. For example, if a Git repo has a ref named "refs/foo/bar", it
     * is considered to be of kind OTHER.
     *
     * Generated from protobuf enum <code>OTHER = 4;</code>
     */
    const OTHER = 4;
}

