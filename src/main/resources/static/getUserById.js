$(async function(id) {
    await getUserById (id)
})

async function getUserById (id) {
    let response = await fetch("/admin/api/admin/" + id, {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Referer': null
        }
    })
    return await response.json()
}