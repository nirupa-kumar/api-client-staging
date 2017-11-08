<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/bigtable_instance_admin.proto

namespace Google\Bigtable\Admin\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * Request message for BigtableInstanceAdmin.DeleteInstance.
 * </pre>
 *
 * Protobuf type <code>google.bigtable.admin.v2.DeleteInstanceRequest</code>
 */
class DeleteInstanceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The unique name of the instance to be deleted.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private $name = '';

    public function __construct() {
        \GPBMetadata\Google\Bigtable\Admin\V2\BigtableInstanceAdmin::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The unique name of the instance to be deleted.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * <pre>
     * The unique name of the instance to be deleted.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;
    }

}
