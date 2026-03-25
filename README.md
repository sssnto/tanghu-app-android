# 糖护 App - Android 客户端

糖尿病数字化管理 Android 应用，采用 Kotlin + Jetpack Compose 开发。

## 技术栈

- **语言**: Kotlin 1.9+
- **UI**: Jetpack Compose (Material 3)
- **架构**: MVVM + Clean Architecture
- **DI**: Hilt
- **网络**: Retrofit + OkHttp
- **协程**: Kotlin Coroutines + Flow

## 项目结构

```
app/
├── src/main/java/com/tanghu/app/
│   ├── MainActivity.kt
│   ├── data/           # 数据层
│   │   ├── api/        # API 接口
│   │   ├── model/      # 数据模型
│   │   └── repository/ # 仓库实现
│   ├── domain/        # 领域层
│   │   ├── model/      # 领域模型
│   │   └── usecase/    # 用例
│   └── ui/            # 表现层
│       ├── screens/   # 页面
│       ├── components/ # 组件
│       ├── viewmodel/  # ViewModel
│       └── theme/      # 主题
```

## 开发环境

- Android Studio Hedgehog (2023.1.1) 或更高
- JDK 17+
- Android SDK 35

## 快速开始

```bash
# 克隆项目
git clone https://github.com/sssnto/tanghu-app-android.git

# 使用 Gradle wrapper 构建
./gradlew assembleDebug

# 安装到设备
./gradlew installDebug
```

## 功能模块

- [x] 首页 - 今日血糖概览
- [x] 记录 - 血糖数据录入
- [x] 趋势 - 血糖趋势图表
- [x] 我的 - 个人中心

## License

Proprietary - 糖护科技
