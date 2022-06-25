package triandaafandi.ac.id.example.githubprofile.services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import triandaafandi.ac.id.example.githubprofile.models.GithubUser

interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
        @Path("login") userLogin: String
    ): Call<GithubUser>
}