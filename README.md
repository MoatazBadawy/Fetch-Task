<h1 align="center">Fetch: Tech Company Task</h1>

<p align="center">
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <a href="https://kotlinlang.org"><img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-1.8.xxx-a97bff"/></a>
  <img alt="Clean Architecture" src="https://img.shields.io/badge/Clean-Architecture-white"/>
  <img alt="MVVM" src="https://img.shields.io/badge/MVVM-Architecture-orange"/>
</p>

<p align="center">  
🐶 Fetch: Simple Application that gets data from the Internet and displays them in a list after some operations. Powered by Retrofit, Okhttp, Hilt, Coroutines. Structured by Clean architecture and MVVM.
</p>
</br>

https://github-production-user-asset-6210df.s3.amazonaws.com/63272288/280412503-77003dda-7e9f-4bab-91ad-550673a23fb0.mp4

## Tech stack & Open-source libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- Jetpack
  - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
  - ViewModel: Manages UI-related data holder and lifecycle awareness. Allows data to survive configuration changes such as screen rotations.
  - StateFlow: For reactive style programming (from VM to UI). 
  - DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
  - [Hilt](https://dagger.dev/hilt/): for dependency injection.
  - [Material-Components](https://github.com/material-components/material-components-android) - Material design components like ripple animation, cardView.
- Architecture
  - Clean Architecture (Data - Domain - UI)
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
  - Repository Pattern
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Construct the REST APIs and paging network data.
- [Kotlin-DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - Used to handle gradle dependencies and config versions.

## TODO
- [X] Apply Architecture
- [X] Handel Retrofit to get the data from remote
- [X] Handel DI Modules using Hilt
- [X] Apply MVVM for fetch viewmodel and UI
- [X] Display the Items in Recyclerview
- [X] Filter items to remove empty or null
- [X] Grouped items by listId
- [X] Sorted items by name
