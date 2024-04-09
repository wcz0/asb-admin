/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80200 (8.2.0)
 Source Host           : localhost:3306
 Source Schema         : asb

 Target Server Type    : MySQL
 Target Server Version : 80200 (8.2.0)
 File Encoding         : 65001

 Date: 18/02/2024 02:01:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_casbin_rule
-- ----------------------------
DROP TABLE IF EXISTS `admin_casbin_rule`;
CREATE TABLE `admin_casbin_rule` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ptype` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `v0` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `v1` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `v2` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `v3` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `v4` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `v5` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_casbin_rule
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for admin_menus
-- ----------------------------
DROP TABLE IF EXISTS `admin_menus`;
CREATE TABLE `admin_menus` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int NOT NULL DEFAULT '0',
  `order` int NOT NULL DEFAULT '0',
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '菜单名称',
  `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单图标',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单路由',
  `url_type` tinyint NOT NULL DEFAULT '1' COMMENT '路由类型(1:路由,2:外链)',
  `visible` tinyint NOT NULL DEFAULT '1' COMMENT '是否可见',
  `is_home` tinyint NOT NULL DEFAULT '0' COMMENT '是否为首页',
  `component` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单组件',
  `is_full` tinyint NOT NULL DEFAULT '0' COMMENT '是否是完整页面',
  `extension` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '扩展',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_menus
-- ----------------------------
BEGIN;
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (1, 0, 0, '仪表盘', 'mdi:chart-line', '/dashboard', 1, 1, 1, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-09 10:15:02');
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (2, 0, 99, '系统管理', 'material-symbols:settings-outline', '/system', 1, 1, 0, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-13 16:57:05');
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (3, 2, 0, '用户', 'ph:user-gear', '/system/admin_users', 1, 1, 0, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-09 10:15:02');
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (4, 2, 0, '角色', 'carbon:user-role', '/system/admin_roles', 1, 1, 0, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-09 10:15:02');
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (5, 2, 0, '权限', 'fluent-mdl2:permissions', '/system/admin_permissions', 1, 1, 0, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-09 10:15:02');
INSERT INTO `admin_menus` (`id`, `parent_id`, `order`, `title`, `icon`, `url`, `url_type`, `visible`, `is_home`, `component`, `is_full`, `extension`, `created_at`, `updated_at`) VALUES (6, 2, 0, '菜单', 'ant-design:menu-unfold-outlined', '/system/admin_menus', 1, 1, 0, NULL, 0, NULL, '2023-10-09 10:15:02', '2023-10-09 10:15:02');
COMMIT;

-- ----------------------------
-- Table structure for admin_permission_menu
-- ----------------------------
DROP TABLE IF EXISTS `admin_permission_menu`;
CREATE TABLE `admin_permission_menu` (
  `permission_id` int NOT NULL,
  `menu_id` int NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  KEY `admin_permission_menu_permission_id_menu_id_index` (`permission_id`,`menu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_permission_menu
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for admin_permissions
-- ----------------------------
DROP TABLE IF EXISTS `admin_permissions`;
CREATE TABLE `admin_permissions` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `slug` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `http_method` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `http_path` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `order` int NOT NULL DEFAULT '0',
  `parent_id` int NOT NULL DEFAULT '0',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `admin_permissions_name_unique` (`name`) USING BTREE,
  UNIQUE KEY `admin_permissions_slug_unique` (`slug`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_permissions
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for admin_settings
-- ----------------------------
DROP TABLE IF EXISTS `admin_settings`;
CREATE TABLE `admin_settings` (
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `values` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_settings
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for admin_users
-- ----------------------------
DROP TABLE IF EXISTS `admin_users`;
CREATE TABLE `admin_users` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remember_token` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `admin_users_username_unique` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of admin_users
-- ----------------------------
BEGIN;
INSERT INTO `admin_users` (`id`, `username`, `password`, `name`, `avatar`, `remember_token`, `created_at`, `updated_at`) VALUES (1, 'test', '$2a$10$7rkK40YwKno7Xz3tPUHNaemoM47vevtKZ.fyGc.2r15TzH2IE9H9m', '   ', '   ', NULL, NULL, '2024-02-11 03:22:13');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
